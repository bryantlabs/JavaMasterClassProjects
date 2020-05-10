//Alternative Method 2 for solving the numberToWords challenge
//Just to note: I prefer my NumberToWords.java class for solving the challenge

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

        for (int i = numberCounter; i < count; i++) {
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
//THE CODE ABOVE DOES WORK
//*********************************************************************
//*********************************************************************

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
//        for (int i = 0; i < diffInCounters; i++) {
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