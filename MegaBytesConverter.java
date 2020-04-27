public class MegaBytesConverter {

 public static void printMegaBytesAndKiloBytes(int kilobytes){

     if (kilobytes < 0){
         System.out.println("Invalid Value");
     }else {
         int divisor = 1024;
         int dividend = kilobytes;
/* The variable dividend here is noted as redundant by I choose to use it because
   it helps me read the code easier.   */
         int quotient = dividend / divisor;
         int remainder = dividend % divisor;

         System.out.println(dividend + " KB = " + quotient + " MB " +"and " + remainder + " KB");

     }
 }

}
