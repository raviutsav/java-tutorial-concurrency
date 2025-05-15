package thread;

public class ThreadFromImplementingRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println(
                "Thread Name: " + Thread.currentThread().getName() + " which is created by implementing Runnable Interface."
        );
    }
}
