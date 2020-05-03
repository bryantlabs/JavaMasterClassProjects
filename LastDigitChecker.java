public class LastDigitChecker {

    public static boolean hasSameLastDigit(int oneLastDigit, int twoLastDigit, int threeLastDigit) {

        if ((oneLastDigit < 10 || oneLastDigit > 1000) || (twoLastDigit < 10 || twoLastDigit > 1000) ||
                (threeLastDigit < 10 || threeLastDigit > 1000)) {
            return false;

        } else
            oneLastDigit = oneLastDigit % 10;
            twoLastDigit = twoLastDigit % 10;
            threeLastDigit = threeLastDigit % 10;

            if ((oneLastDigit == twoLastDigit) || oneLastDigit == threeLastDigit ||
                twoLastDigit == threeLastDigit){
                return true;
            }
            return false;
    }

    public static boolean isValid(int number){

        if ((number < 10) || (number > 1000)){
            return false;
        }   else {
            return true;
        }

    }

}
