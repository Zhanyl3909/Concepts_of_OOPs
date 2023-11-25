public class Main {
    public static void main(String[] args) {

        var currentThread = Thread.currentThread();
        System.out.println(currentThread.getClass().getName());

        System.out.println(currentThread);
        printThreadState(currentThread);
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
