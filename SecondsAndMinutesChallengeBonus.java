/*This can get a little confusing so be careful with the remaining minutes and
remaining seconds. Pay attention to which variables you use in the return.

Also remember when determining your solution that the final returned value is actually
a String and not an integer or long so plan for your solution based on this awareness.
 */


public class SecondsAndMinutesChallengeBonus {

    public static String getDurationString(int minutes, int seconds) {
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return "Invalid Value";
        } else {

            int hours = minutes / 60;
            int remainingminutes = minutes % 60;

            String hoursString = (hours + "h ");
            String minutesString = (remainingminutes + "m ");
            String secondsString = (seconds + "s ");

            if (hours < 10){
                hoursString = ("0" + hoursString);
            }
            if (remainingminutes < 10){
                minutesString = ("0" + minutesString);
            }

            if (seconds < 10){
                secondsString = ("0" + secondsString);
            }
            return (hoursString + minutesString + secondsString );
        }
    }

    public static String getDurationString(int seconds) {

        if (seconds < 0) {
           return "Invalid Value";
        } else {

            int minutes = seconds / 60;
            int remainingSeconds = seconds % 60;

            return getDurationString(minutes,remainingSeconds);
        }
    }

}
