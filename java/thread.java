class MyTask implements Runnable {
    @Override
    public void run() {
        // Code to execute in the new thread
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            try {
                Thread.sleep(500); // Pause for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class thread {
    public static void main(String[] args) {
        MyTask task = new MyTask();
        
        // Pass the Runnable task to a Thread object
        Thread thread1 = new Thread(task, "Worker-1");
        Thread thread2 = new Thread(task, "Worker-2");

        // Start execution (calls run() asynchronously)
        thread1.start();
        thread2.start();
    }
}