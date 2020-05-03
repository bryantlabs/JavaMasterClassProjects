
/* Create a for statement using any range of numbers to determine
    if the number is a prime number. If it is a prime number print
    it out and increment a count of the number of prime numbers found. Exit
    the loop when the count is equal to 10.

    hint: Use the break statement to exit the loop.
 */


/*I included the main method here for illustration purposes
only. The code will not run as is unless you paste it into a project
that was created as a template that inlcuded the command line app with the
Main Class and Main method. If you create a a Main Class
and place your main method inside it and then call the isprime() method
it will work. Or to simplify it create a new project in IntelliJ as a template
to include the main method and and place all code inside the Main Class.
*/

//    public class IsPrime {
//        public static void main(String[] args) {
//            int number = 51;   //I could also put i < 51 in the for statement;
//            int count = 0;
//            for (int i = 2; i < number; i++) {
//                if (isPrime(i)) {
//                    count++;
//                    System.out.println(i + " is a prime number.");
//                }
//                if (count == 10) {
//                    System.out.println("Exiting the loop with a total number of " +
//                            +count + " prime numbers");
//                    break;
//                }
//            }
//
//        }
//
//        public static boolean isPrime(int number) {
//
//            if (number == 1) {   // Prime numbers must be > 1)
//                return false;
//            }
//            for (int i = 2; i < number; i++) {
//                if (number % i == 0) {
//                    return false;
//                }
//            }
//            return true;
//        }
//    }
