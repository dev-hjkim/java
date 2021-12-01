package e.thread.practice;

import java.util.Date;

public class TimerThread extends Thread{
    public void run() {
        TimerThread thread = new TimerThread();
        thread.printCurrentTime();
    }

    public void printCurrentTime() {
        int loop = 0;
        while(loop < 10) {
            Date cur = new Date();
            System.out.println(cur.toString());
            System.currentTimeMillis();
            try {
                Thread.sleep(1000);
                loop++;
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }
    }
}