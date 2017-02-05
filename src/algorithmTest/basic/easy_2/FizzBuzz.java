package algorithmTest.basic.easy_2;

import java.util.LinkedList;
import java.util.List;

public class FizzBuzz {
	public List<String> fizzBuzz(int n) {
		List<String> out = new LinkedList<>();
		for (int i =1;i<= n;i++){
			StringBuilder sb = new StringBuilder();
			if(i%3 == 0 ){
				sb.append("Fizz");
			}
			if(i%5 == 0){
				sb.append("Buzz");
			}
			if(i%3 != 0 && i%5 != 0){
				sb.append(i);
			}
			out.add(sb.toString());
		}
		return out;
	}
}
