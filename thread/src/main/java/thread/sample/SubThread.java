package thread.sample;

public class SubThread extends Thread {
    @Override
    public void run() {
        System.out.println("Call from " + getName());
    }
}
