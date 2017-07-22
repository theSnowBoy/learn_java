package algorithmTest.basic.medium.medium_3;

public class ComplexNumberMultiply {
	
    public String complexNumberMultiply(String a, String b) {
        int realA = 0,realB = 0;
        int imagineA = 0,imagineB = 0;
        String arrayA[] = a.split("\\+");
        String arrayB[] = b.split("\\+");
        realA = Integer.parseInt(arrayA[0]);
        realB = Integer.parseInt(arrayB[0]);
        imagineA = Integer.parseInt(arrayA[1].substring(0, arrayA[1].indexOf('i')));
        imagineB = Integer.parseInt(arrayB[1].substring(0, arrayB[1].indexOf('i')));
        
        int newReal = realA * realB - imagineA * imagineB;
        int newImagine = realA * imagineB + realB * imagineA;
        StringBuilder result =  new StringBuilder();
        result.append(newReal).append("+").append(newImagine).append('i');
        
        return result.toString();
        
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "-1";
		System.out.println(Integer.parseInt(data));

	}

}
