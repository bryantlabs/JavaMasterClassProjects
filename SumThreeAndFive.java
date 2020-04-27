/* Create a for statement using a range of number from 1 to 1000 inclusive;
    Sum all the numbers that can be divided with both 3 and also with 5;
    For those numbers that met the above conditions, print out the number;
   Break out of the loop once you find 5 numbers that met the above conditions;
   After breaking out of the loop print the sum of the numbers that met the above
   conditions;
 */

public class SumThreeAndFive {

    public static void sumThreeAndFive(int number) {

        int sum = 0;
        int count = 0;

        if (number < 1 || number > 1000) {
            System.out.println("Invalid Value");
        } else {
            for (int i = 1; i <= 1000; i++) {
                if ((i % 3 == 0) && (i % 5 == 0)) {
                    sum = sum + i;
                    count++;
                    System.out.println(i + " is divisible by 3 and 5");
//                    System.out.println(count);
                }
                if (count == 5){
                System.out.println(sum + " is the sum of numbers divisible by 3 and 5");
                    break;
                }
            }
        }
    }
}
