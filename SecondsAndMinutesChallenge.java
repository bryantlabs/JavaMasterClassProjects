/*This can get a little confusing so be careful with the remaining minutes and
remaining seconds. Pay attention to which variables you use in the return.
 */

public class SecondsAndMinutesChallenge {

    public static String getDurationString(int minutes, int seconds) {
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return "Invalid Value";
        } else {

            int hours = minutes / 60;
            int remainingminutes = minutes % 60;

            return (hours + "h " + remainingminutes + "m " + seconds + "s");

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