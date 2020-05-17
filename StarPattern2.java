public class StarPattern2 {
    public static void starPattern2(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = number; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


//**********************************************************************

/*I've seen this code but can't seem to wrap my head around
 it. I have a hard time understanding the decrementing the first
 for() instead of the second one. It just makes more sense to me
 to have the first for() to represent the row and the second for()
 represent the columns. Then decrement the columns.
//*/

//public class StarPattern2 {
//    public static void starPattern2(int number) {
//        for (int i = 5; i >= 1; i--) {
//              for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}