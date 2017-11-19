package algorithmTest.basic.easy_math;

public class Heart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for( double y = 1.3 ; y >= -1.1 ; y -= 0.1 ){
		       for( double x = -1.2 ; x <= 1.2 ; x += 0.05){
		           if( Math.pow((x*x+y*y-1.0),3) - x*x*y*y*y <= 0.0 ){
		              System.out.print("*");
		              }
		           else{
		        	   System.out.print(" ");
		           }
		           }
		       System.out.println();
		   }
	}
}
