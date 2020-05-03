public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        int lastDigit = 0;
        int newNumber = 0;

        if (number < 0) {
            return -1;
        } else {

            while (number > 0) {        // See note: below
                lastDigit = number % 10;
                number = number / 10;

                if (lastDigit % 2 == 0) {
                    newNumber = newNumber + lastDigit;
                }
            }
            return newNumber;
        }
    }

}


/* note:
When I originally worked this problem I forgot the curly braces after the while().
IntelliJ listed the error [Variable 'number' is not updated inside of loop]. This
was obviously because I did not put the curly braces in after the while() and Java
was not executing/updating my lastDigit and number calculations.
Try not to forget the curly braces, but remember if the loop is not updating
check to make sure you did not forget the curly braces.
 */