package e.thread.object;

public class RunObjectThreads {
    public static void main(String[] args) {
        RunObjectThreads sample = new RunObjectThreads();
//        sample.checkThreadState2();
        sample.checkThreadState3();
    }

    public void checkThreadState2() {
        Object monitor = new Object();
        StateThread thread = new StateThread(monitor);

        try {
            System.out.println("thread state=" + thread.getState());    // NEW
            thread.start();
            System.out.println("thread state(after start)=" + thread.getState());   // RUNNABLE

            Thread.sleep(100);
            System.out.println("thread state(after 0.1 sec)=" + thread.getState()); // WAITING

            synchronized (monitor) {
                monitor.notify();
            }

            Thread.sleep(100);
            System.out.println("thread state(after notify)=" + thread.getState());  // TIMED_WAITING

            thread.join();
            System.out.println("thread state(after join)=" + thread.getState());    // TERMINATED
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }

    public void checkThreadState3() {
        Object monitor = new Object();
        StateThread thread = new StateThread(monitor);
        StateThread thread2 = new StateThread(monitor);

        try {
            System.out.println("thread state=" + thread.getState());    // NEW
            thread.start();
            thread2.start();
            System.out.println("thread state(after start)=" + thread.getState());   // RUNNABLE

            Thread.sleep(100);
            System.out.println("thread state(after 0.1 sec)=" + thread.getState()); // WAITING

            synchronized (monitor) {
//                monitor.notify();
//                monitor.notify();
                monitor.notifyAll();
            }

            Thread.sleep(100);
            System.out.println("thread state(after notify)=" + thread.getState());  // TIMED_WAITING

            thread.join();
            System.out.println("thread state(after join)=" + thread.getState());    // TERMINATED
            thread2.join();
            System.out.println("thread2 state(after join)=" + thread2.getState());
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}