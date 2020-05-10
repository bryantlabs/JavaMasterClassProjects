//An additional asterick pattern using only for()'s;

public class AdditionalAsterickPattern {

    public static void  additionalAsterick(int number){

        for (int i = 1; i <= number; i++){
            for (int j= 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i = (number - 1); i > 0; i--){
            for (int j= 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
