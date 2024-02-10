package main.java.core.module.aiModule;

import main.java.core.ai.behaviorTree.robotTrees.central.CentralCoordinatorRoot;
import main.java.core.constants.ProgramConstants;
import main.java.core.messaging.Exchange;
import main.java.core.module.Module;
import proto.triton.CoordinatedPassInfo.CoordinatedPass;
import proto.triton.CoordinatedPassInfo.MoveRobot;
import proto.triton.FilteredObject.Robot;
import proto.vision.MessagesRobocupSslWrapper.SSL_WrapperPacket;

import static proto.triton.FilteredObject.*;
import static proto.triton.CoordinatedPassInfo.*;

import java.io.IOException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.Delivery;

import static main.java.core.messaging.SimpleSerialize.simpleDeserialize;
import main.java.core.ai.GameInfo;
import main.java.core.ai.behaviorTree.robotTrees.basicFunctions.CoordinatedPassNode;
import main.java.core.util.Vector2d;

/**
 * Responsible for coordinating team actions such as passing
 */
public class CentralCoordinatorModule extends Module {

    private final CentralCoordinatorRoot centralCoordinatorRoot;

    public CentralCoordinatorModule(ScheduledThreadPoolExecutor executor) {
        super(executor);
        this.centralCoordinatorRoot = new CentralCoordinatorRoot(executor);
    }

    /**
     * At defined frequency, run Central Coordinator Root
     */
    public void run() {
        this.centralCoordinatorRoot.execute();
    }

    @Override
    protected void prepare() {

    }

    @Override
    protected void declareConsumes() throws IOException, TimeoutException {
        declareConsume(Exchange.CENTRAL_COORDINATOR_PASSING, this::callbackCoordinatedPassingControl);
    }

    private void callbackCoordinatedPassingControl(String s, Delivery delivery){
        CoordinatedPass message = (CoordinatedPass) simpleDeserialize(delivery.getBody());

        for (Robot ally : GameInfo.getAllies()) {
            if (ally.getId() == message.getReceiverID()) {
                System.out.println("Reciever: " +  message.getReceiverID() + ", " + "Sender: " +  message.getSenderID());
                // send message to receiver to expect ball at passLoc
                float moveX = message.getPassLocX() - ally.getX();
                float moveY = message.getPassLocY() - ally.getY();
                MoveRobot moveRobot = MoveRobot.newBuilder().setMoveVectorX(moveX).setMoveVectorY(moveY).build();

                Exchange channel = null;
                switch (ally.getId()){
                    case 0:
                        channel = Exchange.AI_ROBOT_0;
                        break;
                    case 1:
                        channel = Exchange.AI_ROBOT_1;
                        break;
                    case 2:
                        channel = Exchange.AI_ROBOT_2;
                        break;
                    case 3:
                        channel = Exchange.AI_ROBOT_3;
                        break;
                    case 4:
                        channel = Exchange.AI_ROBOT_4;
                        break;
                    case 5:
                        channel = Exchange.AI_ROBOT_5;
                        break;
                }

                publish(channel, moveRobot);
            }else {
                // send message to all other robots to position based on passLoc
            }
        }
    } 
}
