public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double numberOne, double numberTwo){

                int myNewNumberOne = (int)(numberOne *1000);
                int myNewNumberTwo = (int)(numberTwo *1000);

                if (myNewNumberOne == myNewNumberTwo){
                    return true;
                }
                return false;
    }

}
