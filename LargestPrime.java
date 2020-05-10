
/*
I have commented all code out. Each example or exercise begins with its
own public class{}. Download this file into your IDE and the uncomment
each exercise and play around. You will need to add your own main method
in order to run the code.

 The beginning of lesson Exercise 25 Largest Prime;
 Please see exercise 1 below to practice with determining
 factors for a number without considering the largest prime
 factor first. Then come back and work this exercise. I have also
 included additional exercises below for extra practice.
*/

//    Determining largest prime using a while loop
public class LargestPrime {

    public static int getLargestPrime(int number) {

        if (number <= 1) {
            return -1;
        }
        int largestPrime = 0;
        int count = 2;
        while (count <= number) {
            if (number % count == 0) {
                largestPrime = count;
                number = number / count;
                continue;   /* must use continue here in order to
                             to keep the if calculation of largestPrime
                             and number executing without incrementing.
                             remember that the continue inside the
                             if statement nested inside a while statement
                             keeps the if going without incrmenting the while
                             count ++. But a continue inside an if statement
                               nested inside a for loop would cause the for to
                               increment.*/
            }
            count++;
        }
        return largestPrime;
    }
}

// Exercise 1.  For practice, just determine factors for a number
// using a while loop;

//public class LargestPrime {
//
//        int i = 2;
//
//        if (number < 0) {
//            System.out.println("Invalid Number");
//        } else {
//            while (i <= number) {
//                if (number % i == 0) {
//                    System.out.println(i + " is a factor of  " + number);
//                }
//                i++;
//            }
//        }
//    }
//}

// Now go back to exercise above and complete for largest prime factor.
// You can also work the following exercises for additional practice.



/* exercise 2 -  Using a do/while to determine largest prime
actor of number.
 */
//public class LargestPrime {
//    public static int getLargestPrime(int number) {
//
//        if (number <= 1) {
//            return -1;
//        } else {
//            int largestPrime = 0;
//            for (int i = 2; i <= number; i++) {
//                if (number % i == 0) {
//                    largestPrime = i;
//                    do {
//                        number /= i;
//                    }
//                    while (number % i == 0);
//                }
//            }
//            return largestPrime;
//        }
//    }
//}


/*exercise 3 - us an if statement nesting within a for statement
to determine largest prime factor for a number;
*/
//public class    LargestPrime{
//
//    public static   int largestPrime(int number){
//        // determine if largestPrime needs to be a global variable
//        // or a local variable.
//
//        if (number <= 1){
//            return -1;
//        }else {
//            int largestPrime = 0;
//            for (int i = 2; i <= number; i++){
//
//                if (number % i == 0){
//                    largestPrime = i;
//                    number /= i;
//                    i--;
//                }
//            }
//            return largestPrime;
//        }
//   }
// }

/* exercise 4 -  Using a for/if nested inside an if/else statement
using the continue, and incrementing outside of the for statement to
determine largest prime factor of number. Could also use a while(number % i == 0)
instead of the if (number % i == 0) and not need to use the continue command;
 */
//public class LargestPrime {
//    public static int largestPrime(int number) {
//
//        if (number <= 1) {
//            return -1;
//        } else {
//            int largestPrime = 0;
//            for (int i = 2; i <= number; ) {
//                if (number % i == 0) {
//                    largestPrime = i;
//                    number /= i;
//                    continue;
//                }
//                i++;
//            }
//            return largestPrime;
//        }
//    }
//}
//

