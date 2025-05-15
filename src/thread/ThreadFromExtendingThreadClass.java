package thread;

public class ThreadFromExtendingThreadClass extends Thread {

    public void run() {
        System.out.println(
                "Thread Name: " + Thread.currentThread().getName() + " which is created by extending Thread class."
        );
    }
}
