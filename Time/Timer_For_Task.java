import java.util.Calendar;
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

        Calendar date = Calendar.getInstance();
        date.set(Calendar.YEAR, 2023);
        date.set(Calendar.MONTH, Calendar.DECEMBER);
        date.set(Calendar.DAY_OF_MONTH,17);
        date.set(Calendar.HOUR_OF_DAY,19);
        date.set(Calendar.MINUTE,10);

        timer.schedule(task,date.getTime());   //this task would execute when the time's come

    }
}



/*
    Timer - a facility for thread to schedule tasks
            for future execution in a background thread

    TimerTask - a task that can be scheduled for one-time
                or repeated execution by a Timer


                TimerTask linked to Timer!
 */
