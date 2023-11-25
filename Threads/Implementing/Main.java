import java.util.concurrent.TimeUnit;

//All 3 Threads running at the same time
public class Main {
    public static void main(String[] args) {

        var currentThread = Thread.currentThread();
        System.out.println(currentThread.getClass().getName());

        System.out.println(currentThread);
        printThreadState(currentThread);

        CustomThread customThread = new CustomThread();
        customThread.start(); //why start() not run() ?
        //run() first executes Custom.java then after finishing -> main sequentially


        //For checking concurrency of with main & custom
        for(int i=1; i<=3; i++) {
            System.out.print(" 0 ");
            try {
                TimeUnit.MICROSECONDS.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        Runnable myRunnable = () -> {
          for(int i=1; i<=8; i++) {
              System.out.print(" 2 ");
          } try {
              TimeUnit.MILLISECONDS.sleep(300);
            } catch (InterruptedException e) {
              e.printStackTrace();
            }
        };

        Thread myThread = new Thread(myRunnable);
        myThread.start();
    }


    public static void printThreadState(Thread threadMy) {
        System.out.println("---------------------------");
        System.out.println("Thread ID: " + threadMy.getId());
        System.out.println("Thread Name: " + threadMy.getName());
        System.out.println("Thread Priority: " + threadMy.getPriority());
        System.out.println("Thread State: " + threadMy.getState());
        System.out.println("Thread Group: " + threadMy.getThreadGroup());
        System.out.println("Thread Is Alive: " + threadMy.isAlive());
        System.out.println("---------------------------");
    }
}
