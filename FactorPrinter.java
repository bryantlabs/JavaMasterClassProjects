public class FactorPrinter {

    public static void printFactors(int number) {

        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    int factor = i;      // See note below;
                    System.out.println(factor);
                }
            }
        }
    }
}

/* IntelliJ tells me local variable factor is redundant
   but I think it helps me read the code better.
    I wanted anyone reading the code to be able to see that
    I was calculating for factors of a number and that the
    for() was using i as potential factors. */