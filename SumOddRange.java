public class SumOddNumbersRange {

    //This isOdd combines two condition and returns two possible conditions.
    //I did include an alternative solution but with an extra step below.

    public static boolean isOdd(int number) {

        if ((number > 0) && (number % 2 != 0)) {       // if() could be simplified to:  return (number > 0) && (number % 2 != 0);
            return true;
        } else {
            return false;
        }
    }

    public static int sumOdd(int start, int end) {

        int sumOddNumbers = 0;

        if ((start > end) || (start < 0)) {
            return -1;
        } else
            for (int i = start; i <= end; i++){
                if (isOdd(i)){
                    sumOddNumbers = sumOddNumbers + i;
                    System.out.println("my odd number is " + i);  // I include this println here to see all my odd numbers as a visual test my code is working as expected.
                    System.out.println(sumOddNumbers);
                }
            }
                return sumOddNumbers;
    }
}


//Alternative way to create isOdd() but with an extra return; I like the one above
//    public static boolean isOdd(int number) {
//
//        if ((number < 0)) {
//            return false;
//        } else if (number % 2 != 0) {
//            return true;
//        }
//        return false; //This return accounts for condition if (number % 2 ==0)
//    }
//}