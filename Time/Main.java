import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {

        Timer timer = new Timer();  //when the time is up it is going to execute timertask

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Task is complete: ");
            }
        };
        timer.schedule(task, 5000);   //the second argument is - time for delaying
    }
}



/*
    Timer - a facility for thread to schedule tasks
            for future execution in a background thread

    TimerTask - a task that can be scheduled for one-time
                or repeated execution by a Timer


                TimerTask linked to Timer!
 */
