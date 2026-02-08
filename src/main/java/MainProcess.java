import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public class MainProcess {

    private final ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();

    public void handleRequest() {
        checkJobStatusWithRetry(()-> executeNextStep());
    }

    private void checkJobStatusWithRetry(Runnable onSuccess) {
        AtomicReference<ScheduledFuture<?>> futureRef = new AtomicReference<>();
        ScheduledFuture<?> future = scheduler.scheduleWithFixedDelay(() -> {
            if (checkJobStatus()) {
                System.out.println("作业状态正常，继续执行后续逻辑");
//                scheduler.shutdown(); // 停止定时任务
                System.out.println("1112");
                onSuccess.run();
                futureRef.get().cancel(false);
                System.out.println("测试效果");
                scheduler.shutdown();
                 }else {
                System.out.println("作业异常，3分钟后重试...");
//                checkJobStatusWithRetry(onSuccess); // 再次调度
            }
        }, 1,1, TimeUnit.MINUTES);
        futureRef.set(future);
    }


    public static void main(String[] args) {
        new MainProcess().handleRequest();
    }

    public boolean checkJobStatus(){
        boolean result = true;
//        for (int i = 0; i < 4; i++) {
//            System.out.println("检查脚本状态"+i);
//            if(i%2==1){
//                result = true;
//                break;
//            }
//        }
        return result;
    }

    private void executeNextStep() {
        System.out.println("执行后续操作步骤");
    }

}
