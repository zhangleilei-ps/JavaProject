

import java.util.concurrent.ScheduledFuture;


public class QuartzTaskManager {

    private ScheduledFuture<?> scheduledFuture;
    private Runnable task;
    public void buildTask(){
        this.task = () -> {
            System.out.println("系统开发");
        };
    }
//    public Trigger buildTrigger(){
//
//    }


}
