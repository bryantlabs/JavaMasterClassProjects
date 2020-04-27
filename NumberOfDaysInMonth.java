public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int year) {

        if (year < 1 || year > 9999) {
            return false;
        } else {
            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                return true;
            }
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year) {

                int numberDays = 0;

        if ((month < 1 || month > 12) || (year < 1 || year > 9999)) {
            return -1;

        } else {

            switch (month){
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    numberDays = 31;
                    break;
                case 4: case 6:  case 9: case 11:
                    numberDays = 30;
                    break;

                case 2:
                    boolean leapYear = isLeapYear(year);
                    if (leapYear == true){
                        //could be simplified to if(leapYear) but I like it like above so I can read it better.
                        numberDays = 29;
                    }
                    else numberDays = 28;
                    break;
                default:
                    return -1;


            }
        }
        return numberDays;
    }

}
