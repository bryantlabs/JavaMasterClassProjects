public class CalculateInterest {

    /* Using the for() create a method named calculateInterest.
        Call this method with the amount of 10000 with in interest rate
        of 2,3,4,5,6,7,8 and print to console window.
            Modify the for() above to do the same thing as shown but to start
            from 8% and work back to 2%;
     */



    public static double calculateInterest(double amount, double rate) {

        return amount = amount * (rate / 100);
    }

}

//   The main method would be as follows:

//    public static void main(String[] args) {
//
//        for (int i = 2; i < 9; i++) {
//
//            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",CalculateInterest.calculateInterest(10000, i)));
//     ***Note- The String.format("%.2f", could be left off and just use CalculateInterest.calculateInterest(10000, i) but then the 7%
//                  will give you a long decimal number. Tim threw this in as an extra.
//        }
//
//        for (int i = 8; i > 0; i--){
//            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",CalculateInterest.calculateInterest(10000, i)));
//
//
//        }
//    }
