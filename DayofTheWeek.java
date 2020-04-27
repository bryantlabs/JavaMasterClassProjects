public class PrintDayofTheWeek {

//    public static void  printDayOfTheWeek(int day){

//        switch (day){
//
//            case 1:
//                System.out.println("Sunday");
//                break;
//            case 2 :
//                System.out.println("Monday");
//                break;
//            case 3:
//                System.out.println("Tuesday");
//                break;
//            case 4:
//                System.out.println("Wednesday");
//            case 5:
//                System.out.println("Thursday");
//                break;
//            case 6:
//                System.out.println("Friday");
//            case 7:
//                System.out.println("Saturday");
//                break;
//            default:
//                System.out.println("Invalid Day");
//        }
//
//    }

    public static void printDayOfTheWeek(char day) {

        switch (day) {

            case ('A'):
                System.out.println("Sunday");
                break;
            case ('B'):
                System.out.println("Monday");
                break;
            case ('C'):
                System.out.println("Wednesday");
                break;
            case ('D'):
                System.out.println("Thursday");
                break;
            case ('E'):
                System.out.println("Friday");
                break;
            case ('F'):
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }

}
