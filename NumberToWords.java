
public class NumberToWords {

    public static void numberToWords(int number) {

        int lastDigit = 0;
        int numberCounter = 0;
        int count = getDigitCount(number);

        if (number < 0) {
            System.out.println("Invalid Value");
        }
        number = reverse(number);
        for (int i = numberCounter; i < count; i++) {  // See Note 1 below:

            numberCounter++;

            lastDigit = number % 10;
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
                default:
                    System.out.println("Invalid Value");

            }
        }
    }

    public static int reverse(int number) {
        int reverseNumber = 0;
        int lastDigit = 0;

        while (number != 0) {
            lastDigit = number % 10;
            number = number / 10;
            reverseNumber = (reverseNumber * 10) + lastDigit;
        }
        return reverseNumber;
    }


    public static int getDigitCount(int number) {

        int count = 0;

        if (number < 0) {
            return -1;
        }
        if (number == 0) {
            return 1;
        }
        while (number != 0) {
            number = number / 10;
            count++;
        }
        return count;
    }
}

/* Note 1:
If the original number has one or more ending zeros, then this has to be accounted
for. (example: 100, 300, 20). I am using the for() to pass the value for number that was returned from
the reverse() the number of times the incremental difference is between the
numberToWords() which remember has the reverse number for its input value
and the returned count value from the getDigit() which has the original
number for its input value.  I like this because it feels like a "whole"
process, and not a partial process whereby there are two parts to the solution
if the original number has one or more ending zeros.:
1. process the non zero leading numbers first, then
2. process the leading zeros from the reverse ()
 */
