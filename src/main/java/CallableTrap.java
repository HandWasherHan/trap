import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author han <handwasherhan@gmail.com>
 * Created on 2023
 */
public class CallableTrap {
    class Task implements Callable {

        @Override
        public Object call() throws Exception {
            return null;
        }
    }
    public static void main(String[] args) {
        /**
         * callable不会主动抛出异常除非调用Future.get();
         */
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(() -> {
            int[] nums = new int[2];
            System.out.println(nums[6]);
            return "";
        });

    }
}
