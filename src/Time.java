/**
 * The Time class represents a 24-hour clock. A clock is represented
 * with hours, minutes, and seconds
 */
public class Time {

    private int hours;
    private int minutes;
    private int seconds;

    /**
     *
     * @param hour represents the hours on the clock
     * @param minute represents the minutes on the clock
     * @param second represents the seconds on the clock
     */
    public Time(int hour, int minute, int second){
        hours = hour;
        minutes = minute;
        seconds = second;
    }


    /**
     *Increases the second quantity by 1, and updates minute and hour quantities when appropriate
     *
     */
    public void tick(){
        if (seconds<=59){
            seconds+=1;
        }
        if (seconds == 60){
            seconds = 0;
            minutes++;
            if (minutes == 60){
                minutes = 0;
                hours++;
                if (hours==24){
                    hours =0;
                }
            }
        }
    }


    /**
     * toString method for the Time class. This method returns a string with the hour
     * minute and second amount
     *
     * @return a string in the XX:XX:XX format
     */
    public String toString(){
        String hour = String.valueOf(hours);
        String minute = String.valueOf(minutes);
        String second = String.valueOf(seconds);
        if (hours<10){
            hour = "0" + hours;
        }
        if (minutes<10){
            minute = "0" + minutes;
        }
        if (seconds<10){
            second = "0" + seconds;
        }
        return (hour+":"+minute+":"+second);
    }


    /**
     * @return the amount of hours on the timer
     */
    public int getHours() {
        return hours;
    }


    /**
     * @return the amount of minutes on the timer
     */
    public int getMinutes() {
        return minutes;
    }


    /**
     * @return the amount of seconds on the timer
     */
    public int getSeconds() {
        return seconds;
    }


    /**
     * @param timer this is another Time object
     *
     * Adds the second, minute, and hour quantities from one Time object to this one
     */
    public void add(Time timer){
        hours +=timer.getHours();
        minutes+=timer.getMinutes();
        seconds+=timer.getSeconds();
        if (seconds>=60){
            seconds = seconds - 60;
            minutes++;
        }

        if (minutes>=60){
            minutes = minutes -60;
            hours++;
        }

        if (hours>=24){


            hours = hours-24;
        }
    }
}
