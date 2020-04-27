public class MinutesToYearsAndDays {

    public static void  printYearsAndDays(long minutes){
        if (minutes < 0){
            System.out.println("Invalid Value");
        }
        long year = minutes/ 525600;
        long remainingMinutes = minutes % 525600;
        long days = remainingMinutes/1440;

        System.out.println(minutes + "min = "+ year + "y and " + days + "d");


    }
}
