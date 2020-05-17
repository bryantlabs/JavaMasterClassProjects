public class StarPattern4 {

    public static void starPattern4(int number) {

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int k = (number-1); k >= 0; k--) { // You could use the same variables i, and j
            for (int m = 1; m <= k; m++) {      // but I like changing them, and since I do not
                System.out.print("*");          // like using the letter l I use m.
            }

            System.out.println();
        }
    }
}


//public class StarPattern4 {
//
//        public static void  starPattern4(int number){
//
//            for (int i = 1; i <= number; i++){
//                for (int j= 1; j <= i; j++){
//                    System.out.print("* ");
//                }
//                System.out.println(" ");
//            }
//            for (int i = (number-1); i > 0; i--){
//                for (int j= 1; j <= i; j++){
//                    System.out.print("* ");
//                }
//                System.out.println(" ");
//            }
//        }
//    }
//



