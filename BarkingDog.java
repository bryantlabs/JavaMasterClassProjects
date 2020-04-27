public class BarkingDog {

    public static boolean  shouldWakeUp(boolean barking, int hourOfDay){

        if ((hourOfDay < 0) || (hourOfDay > 23)){
            return false;
        } else {
            if ((barking) && (hourOfDay < 8) || (hourOfDay > 22)){
                /*The above line could be simplified but I choose to keep it
                in its present form so I can read it easier.
                If you like, you could simplify it to the following:
                return (barking) && (hourOfDay < 8) || (hourOfDay > 22) and
                remove the last return false;
                 */
                return true;
            }
            return false;
        }

    }
}
