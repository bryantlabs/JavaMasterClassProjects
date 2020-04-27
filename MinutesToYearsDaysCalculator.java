public class MinutesToYearsDaysCalculator {

    public static void  printYearsAndDays(long minutes){
        if (minutes < 0){
            System.out.println("Invalid Value");
        } else {
            // see notes below;
            long year = minutes / 525600;
            long remainingMinutes = minutes % 525600;
            long days = remainingMinutes / 1440;

            System.out.println(minutes + " min = " + year + " y and " + days + " d");
        }

    }
}

/*
I determined my solution based on the largest number of minutes being input for the
value of minutes as possible.
1 year = 525600 minutes;
1 day = 1440 minutes;
So based on this, I can determine the number of years and days from any number being
passed as minutes. If I wanted to calculate this further and determine the number of months
or weeks I could solve for these using the info above, I would just need to create additional
variables such as remainingMonthsMinutes, or remainingMonthsDays etc....however
 */