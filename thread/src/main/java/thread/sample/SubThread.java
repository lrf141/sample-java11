package thread.sample;

import java.util.concurrent.Callable;

public class SubThread implements Callable<Integer> {

    @Override
    public Integer call() {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Call from " + Thread.currentThread().getName() + " Value : " + i);
            sum += i;
        }
        return sum;
    }
}
