public class FirstLastDigitSum {


    public static int sumFirstAndLastDigit(int number){
        int sumFirstAndLast = 0;
        if (number < 0){
            return -1;

        }else {


            int lastDigit = number % 10;
            System.out.println("lastDigit = "+ lastDigit);

            while (number >= 10) {
                number = number / 10;
                                            /* we set the if() to >= 10 so that the while loop's
                                            last calculation of tempNumber stops when there is no number
                                            in the TENS position, thereby allowing the first digit
                                            which is in the ONES position to be stored as the value of tempNumber.
                                            If I would have used tempNumber != 0 then the while loop would have performed
                                             the tempNumber / 10 one last time and the value 0 would have been stored
                                             as the tempNumber variable and this is not what is wanted.*/

            }
            sumFirstAndLast = number + lastDigit;
            return sumFirstAndLast;
        }
    }
}
