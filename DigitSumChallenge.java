public class DigitSumChallenge {

    public static int sumDigits(int number) {
        int digit = 0;
        int addSum = 0;

        if (number < 10) {
            return -1;
        } else {
            while (number > 0) {
                digit = number % 10;    // Make sure to calculate the % operator statement 1st. See Note 1 below;
                number = number / 10;
                addSum = addSum + digit;
            }
            return addSum;
        }

    }
}
/* Note 1: This may not seem important but I was in a hurry and confident on how to complete this exercise
            and calculated the number = number / 10 first, then calculated digit = number % 10. By calculating the
            value for number first you omit the first digit in the calculation of addSum and only loop throug
            calculation for addSum twice. By remembering to remove the least significant digit first you will
            avoid my mistake.

            Ex. number = 366;        1st loop     2nd Loop number = 6
            number = number / 10;       36     |       0
            digit = number / 10;         6     |       6
            addSum = addSum + digit;     6     |       12  Wrong Answer and since number !> 0, loop stops.


            Ex. number = 366           1st loop   2nd Loop number = 36  3rd Loop number = 3
            digit = number % 10;         6      |       6             |         3
            number = number / 10;       36      |       3             |         0
            addSum = addSum + digit;     6      |       12            |         15  Correct Answer
 */





//    public static int sumDigits(int number) {
//
//        int digit = 0;
//        int remainingNumber = 0;
//        int sumOfAllDigits = 0;
//
//        if (number < 10) {
//            return -1;
//        } else
//            for (int i = 10; i <= number; i++) {
//                digit = number / 10;
//                remainingNumber = number % 10;
//                sumOfAllDigits = digit + remainingNumber;
//            }
//        return sumOfAllDigits;
//    }
//}
