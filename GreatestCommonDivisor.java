public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int numberOne, int numberTwo){
        int gcd = 0;
        if ((numberOne < 10) || (numberTwo < 10)){
            return -1;
        } else {

            for (int i = 2; i <= numberOne || i <= numberTwo; i++){
                if ((numberOne % i == 0) && (numberTwo % i == 0)){
                    gcd = i;
                }
            }
        }
        return gcd;
    }
}
