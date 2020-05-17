public class FlourPacker {
    //To be updated soon;

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if ((bigCount < 0) || (smallCount < 0) || (goal < 0)) {
            return false;
        }
        if (bigCount * 5 + smallCount >= goal){
            goal = (goal % 5);
            System.out.println("Goal is now " + goal);
        }
        if (smallCount >= goal){  //See Note below
            return true;
        } else return false;
    }
}

/*Note: If the total weight of bigCount + smallCount is greater than or equal to the
    weight of goal then the code moves to the next if() and if the weight of smallCount
    is greater than or equal to the weight of goal then the code returns true. This is
    because any excess weight over and above the weight of goal must be furnished by the
    1lb bags of smallCount. An example of the code returning false would be if the parameters
    were (2, 0, 6). Because goal here is 6, and there is no smallCount, then bigCount would
    have 4lbs excess, which means that in order to fulfill a 6 pound order, out of these parameters
    1 lb of a 5lb bag of bigCount would be used to satisfy the order, and since only full bags are to
    be used, this returns false. But, if we had parameters of (2,1,6) then the 1lb bag of smallcount
    would satisfy the overage, and we would actually just be providing the customer with an
    extra 5 lb bag of bigCount for free.
 */