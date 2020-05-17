public class StarPattern1 {

    public static void starPattern1(int number) {
        for (int i = 1; i <= number; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
