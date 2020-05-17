public class AreaCalculator {
    public static double area(double radius){
        if (radius < 0){
            return -1;
        }else {
            double areaOfACircle = radius* (radius * Math.PI);
            return areaOfACircle;
            /* I realize that intializing the local variable double areaOfACircle
             is redundant but it helps me read the code better. I could have just
             stated [return (radius)*(radius * Math.PI);]
             In my method execute System.out.println(AreaCalculator.area(52));*/
        }
    }

    public static double area(double x, double y){

        if ((x < 0) || (y < 0)){
            return -1;
        } else {
                double areaOfARectangle = (x * y);
                return  areaOfARectangle;
        }
    }
}
