// Adds a number of minutes to a given time and calculating the new one
public class TimeCalc {
    public static void main(String[] args) {
        
        //defining the variables from the input
        String time = args[0];
        int addMin = Integer.parseInt(args[1]);
        int hours = Integer.parseInt("" + time.charAt(0) + time.charAt(1));
        int minutes = Integer.parseInt("" + time.charAt(3) + time.charAt(4));

        //adjusting the hours and minutes values according to the number we received
        minutes += addMin;
        hours = (hours + minutes / 60) % 24;
        minutes = minutes % 60;

        //adding a "0" before the hours/minutes if necessary
        String newHours = "" + hours;
        String newMinutes = "" + minutes;
        if(hours < 10) newHours = "0" + newHours;
        if(minutes<10) newMinutes = "0" + newMinutes;

        //printing the new time
        String newTime = "" + newHours + ":" + newMinutes;
        System.out.println(newTime);
    }
}
