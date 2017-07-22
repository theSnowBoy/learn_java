package algorithmTest.basic.easy_6;

public class Number1Bits {
	 // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
        int count = 0;
        do{
            if((n & 1) != 0){
                count ++;
            }
        }while((n = (n >> 1)) != 0);
        return count;
    }
}
