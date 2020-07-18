package thread.sample;

public class SubThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Call from " + Thread.currentThread().getName() + " Value : " + i);
        }
    }

}
