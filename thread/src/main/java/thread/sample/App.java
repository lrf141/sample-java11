/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package thread.sample;

public class App {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new SubThread());
        Thread thread2 = new Thread(new SubThread());
        thread1.start();
        thread2.start();
    }
}
