package thread.sample;

public class SubThread implements Runnable {

    @Override
    public void run() {
        System.out.println("Call from " + Thread.currentThread().getName());
    }

}
