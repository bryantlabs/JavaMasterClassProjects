public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour){

        if (kilometersPerHour < 0){
            return -1;
        }else {
         return Math.round(kilometersPerHour / 1.609);
         //Even though the Math.round() accepts either a float or double
            // we can initialize a variable in our main method of type long
            // to receive the returned Math.round value.
        }
    }

    public static void  printConversion(double kilometersPerHour){
        if (kilometersPerHour < 0){
            System.out.println("Invalid Value");
        }else{
            long totalMiles = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " +
                    totalMiles + " mi/h");
        }
    }


}
