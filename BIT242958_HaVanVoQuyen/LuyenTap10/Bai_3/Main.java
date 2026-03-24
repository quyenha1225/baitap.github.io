package Bai_3;
public class Main
{
    public static void main(String[] args) {
        // Chạy Thread
        WorkerThread thread1 = new WorkerThread();
        thread1.start();

        // Chạy Runnable
        WorkerRunnable myRunnable = new WorkerRunnable();
        Thread thread2 = new Thread(myRunnable);
        thread2.start();
    }
}