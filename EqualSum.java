public class EqualSum {

    public static boolean hasEqualSum(int numberOne, int numberTwo, int numberThree) {

        if (numberOne + numberTwo == numberThree) {
            return true;

//     could be shortened to  return (numberOne + numberTwo == numberThree);
        }
        return false;
    }
}
