public class SharedDigit {

    public static boolean hasSharedDigit(int oneNumber, int twoNumber) {

        int oneLastDigit = 0;
        int twoLastDigit = 0;

        if ((oneNumber < 10 || oneNumber > 99) || (twoNumber < 10 || twoNumber > 99)) {
            return false;
        } else
            while ((oneNumber > 10) && (twoNumber > 10)) {

                oneLastDigit = oneNumber % 10;
                oneNumber = oneNumber / 10;

                twoLastDigit = twoNumber % 10;
                twoNumber = twoNumber / 10;

                if ((oneLastDigit == twoLastDigit) || (oneLastDigit == twoNumber) ||
                        (oneNumber == twoLastDigit) || (oneNumber == twoNumber)) {
                    return true;
                }
            }
        return false;
        }

    }



