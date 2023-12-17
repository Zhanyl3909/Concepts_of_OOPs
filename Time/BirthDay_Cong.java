import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class BirthDay_Cong {
    public static void main(String[] args) {

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int count = 10;
            @Override
            public void run() {

                if(count > 0) {
                    System.out.println(count + " seconds");
                    count--;
                } else {
                    System.out.println("Happy BDay");
                    timer.cancel();
                }
            }
        };

        Calendar date = Calendar.getInstance();
        date.set(Calendar.YEAR, 2023);
        date.set(Calendar.MONTH, Calendar.DECEMBER);
        date.set(Calendar.DAY_OF_MONTH,17);
        date.set(Calendar.HOUR_OF_DAY,19);
        date.set(Calendar.MINUTE,24);
        date.set(Calendar.SECOND,0);

       timer.scheduleAtFixedRate(task,date.getTime(),1000);
       /*       
            In Java, the scheduleAtFixedRate method is a part of the Timer class 
            and is used to schedule a task to be executed at fixed-rate intervals. 
            This means that the task will be executed repeatedly with a constant time delay 
            between the completion of one execution and the start of the next. 
            The method signature is as follows:
        */


    }
}



/*
    Timer - a facility for thread to schedule tasks
            for future execution in a background thread

    TimerTask - a task that can be scheduled for one-time
                or repeated execution by a Timer


                TimerTask linked to Timer!
 */
