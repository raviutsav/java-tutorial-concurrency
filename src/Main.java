import thread.ThreadFromExtendingThreadClass;
import thread.ThreadFromImplementingRunnable;
import thread.ThreadSleep;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Thread t1 = new Thread(new ThreadFromImplementingRunnable());
        /*
        *
        * Runnable is a function interface which has only one method 'void run()'
        * Thread is a class, which implements Runnable interface
        * There is a constructor in Thread class, which takes instance of Runnable as parameter
        * public Thread(Runnable task) {
        *       this(null, null, 0, task, 0);
        * }
        *
        * */
        t1.start();


        /*
         * There are two types of thread, Daemon thread and User thread
         *
         * JVM doesn't wait for daemon thread to join (end). JVM stays alive till all User threads are executing.
         * Backgound task, Garbage Collection, cleaning, for these purpose we use daemon thread.
         *
         * we can go t1.join(), this piece of code makes the main thread(the thread from where t1.join() is called)
         * to wait to t1 thread to finish
         *
         * */
        Thread t2 = new ThreadFromExtendingThreadClass();
        t2.start();


        /*
        *   We should use thread by implementing Runnable class.
        *   The reason is, in java we can extend only one class
        *   So why waste one extend in extending Thread class
        *   For example
        *       ClassA is already extending Thread class, now we want ClassA to extend another classB.
        *       now we can't extend another class since we are already extending Thread class
        *
        *       the possible solution is by implementing Runnable class instead of extending Thread class
        *       ClassA implements Runnable extends ClassB
        * */

        Thread t3 = new Thread(new ThreadSleep());
        t3.start();
    }
}