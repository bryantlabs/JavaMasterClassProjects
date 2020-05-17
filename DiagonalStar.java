/* I only know of one way to solve this challenge. But I do include a solution using
    variable names row and column below if you have a hard time with the variable names
    i and j at first.*/
public class DiagonalStar {

    public static void printSquareStar(int number) {

        for(int i = 1; i <= number; i++){
            for(int j =1; j <= number; j++){
                if ((i == 1)|| (i == number)|| (j == 1)||
                        (j == number) || (j == i) ||
                        (j == (number - i) + 1)) {
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

//My solution with variable names row and column used instead i and j;
//public class DiagonalStar {
//
//    public static void printSquareStar(int number) {
//
//        if (number < 5){
//            System.out.println("Invalid Value");
//        }else
//        for (int row = 1; row <= number; row++) {
//            for (int column = 1; column <= number; column++) {
//                if ((row == 1) || (column == 1) || (row == number)
//                || (column == number) || (row == column)
//                || (column == (number - row) +1)) {
//                    System.out.print("*");
//                }
//                else
//                System.out.print(" ");
//            }
//            System.out.println();
//        }
//    }
//}