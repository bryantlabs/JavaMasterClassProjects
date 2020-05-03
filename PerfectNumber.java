public class PerfectNumber {
    public static boolean isPerfectNumber(int number){
        if (number < 1){
            return false;
        } else {
            int perfectSum = 0;
            for(int i = 1; i < number; i++){
                if (number % i == 0){
                    System.out.println("factors for number = " + i);
                    perfectSum = perfectSum + i;
                    System.out.println(perfectSum);

                }
                if (perfectSum == number){
                    return true;
                }

            }
        }
        return false;
    }

}
