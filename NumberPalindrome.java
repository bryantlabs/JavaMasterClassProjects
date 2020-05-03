public class NumberPalindrome {

    public static boolean isPalindrome(int number) {

        int tempNumber = number;  // needs to be initialized outside of the while loop
        int reverseNumber = 0; // needs to be initialized outside of the while loop

        while (tempNumber != 0) {

            int lastDigit = 0;

            lastDigit = tempNumber % 10;  // stores the last digit of the tempNubmer variable in the lastDigit variable
            tempNumber = tempNumber / 10;  // removes the last digit and stares a new value for the tempNumber variable
            reverseNumber = (reverseNumber * 10) + lastDigit;   //you will need to memorize this formula
        }
        if (number == reverseNumber) {

            return true;
        }
        return false;
    }

}

//Below I use a do while loop
//
//public class NumberPalindrome {
//
//    public static boolean isPalindrome(int number) {
//
//        int tempNumber = number;
//        int reverseNumber = 0;
//
//        do {
//
//            int lastDigit = 0;
//
//            lastDigit = tempNumber % 10;
//            tempNumber = tempNumber / 10;
//            reverseNumber = (reverseNumber * 10) + lastDigit;
//        } while (tempNumber != 0);
//
//        if (number == reverseNumber) {
//            return true;
//        }
//        return false;
//    }
//}