package thread;

public class ThreadSleep implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("The number is: " + i);
            try {
                /*
                * Why we need to catch InterruptedException here
                * Ans - Because while a thread is sleeping or blocked in I/O calls
                *       Other threads can interrupt this thread.
                *       When a sleeping thread is interuppted then InterruptedException occurs
                *
                * we interrupt thread to make its behaviour change
                *
                * " An interrupt is an indication to a thread that it should stop what it is doing and do something else. "
                * */
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
