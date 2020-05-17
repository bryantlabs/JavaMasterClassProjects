public class StarPattern3 {
/*In this star pattern I am using a character '^' to take the place of a space " " so that
I can see my pattern more clearly as I write the code out. As you can see I am decrementing
only the second for() and staying with my preference to always increment the first for().
After you have been able to determine the solution on your own, remove the ^ from the solution
and see how the pattern looks.
 */

    public static void starPattern3(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = number; j > i; j--) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

}





/* I have seen the following and I I do not prefer to decrement the 1st for()
but it does work.
 */
//
//public class    StarPattern3 {
//
//    public static void  starPattern3(int number){
//
//        for (int i = 5; i >= 1; i--) {
//            for (int j = 1; j < i; j++) {
//                System.out.print("^");
//            }
//
//            for (int k= 5; k >= i; k--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}
