package main.java.core.constants;

import main.java.core.module.testModule.TestModule;
// import main.java.core.ai.behaviorTree.robotTrees.basicFunctions.RotateBotNode;
import main.java.core.module.testModule.CoordinatePassTestModule;
import main.java.core.module.testModule.MoveTestModule;
import main.java.core.module.testModule.RotateBotTestModule;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public enum AITest {
    MOVE(MoveTestModule.class, "Test the ability of robots to move a target location."),
    COORDINATED_PASS(CoordinatePassTestModule.class, "Test the ability of a coordinated pass."),
    ROTATE(RotateBotTestModule.class, "Test the ability of the robot to rotate.");

    private final Class<? extends TestModule> testClass;
    private final String desc;

    AITest(Class<? extends TestModule> testClass, String desc) {
        this.testClass = testClass;
        this.desc = desc;
    }

    public Class<? extends TestModule> getTestRunnerClass() {
        return testClass;
    }

    public String getDesc() {
        return desc;
    }

    public TestModule createNewTestModule(ScheduledThreadPoolExecutor executor) {
        try {
            System.out.println(executor);
            return testClass.getConstructor(ScheduledThreadPoolExecutor.class).newInstance(executor);
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }
        throw new IllegalStateException();
    }
    
}
