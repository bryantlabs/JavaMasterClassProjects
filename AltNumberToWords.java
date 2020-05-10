//Alternative Method 2 for solving the numberToWords challenge
//Just to note: I prefer the NumberToWords.java class for solving the challenge

public class AltNumberToWords {

    public static void numberToWords(int number) {

        int count = getDigitCount(number);
        number = reverse(number);

        if (number < 0) {
            System.out.println("Invalid Value");
        }

        int numberCounter = 0;
        while (number != 0) {
            numberCounter++;

            int lastDigit = number % 10;
            number = number / 10;
            switch (lastDigit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }

        }

        for (int i = numberCounter; i < count; i++) {  // See Note 1;
            System.out.println("Zero");
        }
    }

    public static int reverse(int number) {
        int reverseNumber = 0;
        while (number != 0) {

            int lastDigit = number % 10;
            number = number / 10;
            reverseNumber = (reverseNumber * 10) + lastDigit;

        }
        return reverseNumber;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        if (number == 0) {
            return 1;
        }
        int count = 0;
        while (number != 0) {
            count++;
            number = number / 10;
        }
        return count;

    }
}

/*Note 1: for() is taking the difference between the counters
 and adding a zero for each incremental difference. Remember that
 at this point the numberToWords() has the value of the reverse().
 If the original number is 100, then the reverse() returns 001, so
 the number in numberToWords() is now 001...which results in an incremental
  difference of 2, and the for() assures the two zero's are added to the
  final solution.*/


//Alternative Method 2 for solving the numberToWords Challenge
//*********************************************************************
//*********************************************************************
//THIS CODE BELOW WORKS
////THIS CODE BELOW WORKS
//public class AltNumberToWords {
//
//    public static void numberToWords(int number) {
//
//        if (number < 0) {
//            System.out.println("Invalid Value");
//        }
//        if (number == 0) {
//            System.out.println("Zero");
//        }
//        int count = getDigitCount(number);
//        int reversedNumber = reverse(number);
//        int numberCounter = 0;
//        while (reversedNumber != 0) {
//
//            int lastDigit = reversedNumber % 10;
//            reversedNumber = reversedNumber / 10;
//            switch (lastDigit) {
//                case 0:
//                    System.out.println("Zero");
//                    break;
//                case 1:
//                    System.out.println("One");
//                    break;
//                case 2:
//                    System.out.println("Two");
//                    break;
//                case 3:
//                    System.out.println("Three");
//                    break;
//                case 4:
//                    System.out.println("Four");
//                    break;
//                case 5:
//                    System.out.println("Five");
//                    break;
//                case 6:
//                    System.out.println("Six");
//                    break;
//                case 7:
//                    System.out.println("Seven");
//                    break;
//                case 8:
//                    System.out.println("Eight");
//                    break;
//                case 9:
//                    System.out.println("Nine");
//                    break;
//                default:
//                    //System.out.println("Zero");
//            }
//            numberCounter++;
//
//        }
//        int diffInCounters = getDigitCount(number) - getDigitCount(reverse(number));
//        for (int i = 0; i < diffInCounters; i++) {  //See Note 1:
//            System.out.println("Zero");
//        }
//    }
//
//    public static int reverse(int number) {
//        int reverseNumber = 0;
//        while (number != 0) {
//
//            int lastDigit = number % 10;
//            number = number / 10;
//            reverseNumber = (reverseNumber * 10) + lastDigit;
//
//        }
//        return reverseNumber;
//    }
//
//    public static int getDigitCount(int number) {
//        if (number < 0) {
//            return -1;
//        }
//        if (number == 0) {
//            return 1;
//        }
//        int count = 0;
//        while (number != 0) {
//            count++;
//            number = number / 10;
//        }
//        return count;
//
//    }
//}

/* Note 1:  Here I am solely depending on the getDigitCount()
to provide me the incremental difference between the original number
and the reverse number. In my alternative method 2 above I was comparing
the incremental counters from two different methods; here, I am comparing the
same incremental counter from the getDigitMethod() but providing the method
with two different input values.

As same as above, if the original number is 100,
then the reverse() returns 001, so the number in numberToWords() is now
001...which results in an incremental difference of 2, and the for() assures
the two zero's are added to the final solution.
 */
