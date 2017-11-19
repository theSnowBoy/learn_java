import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNextLine()){
        	int n = in.nextInt();
        	Map<String, Integer> results = new TreeMap<>();
            for(int i = 0; i < n;i++){
            	results.put(in.nextLine(), 0);
            }
            
            for(int i = 0; i < n;i++){
            	String score = in.nextLine();
            	getResult(score,results);
            }
            
            //排序
            int[] data = new int[n];
            int i =0;
            for(Integer value : results.values()){
            	data[i++] = value;
            }
            Arrays.sort(data);
            int mid = data[n/2 - 1];
            
            //TODO 输出结果
            for(String key :results.keySet()){
            	if(Integer.valueOf(results.get(key)) >=  mid){
            		System.out.println(key);
            	}
            }
        }
    }
    
    public static void getResult(String score,Map<String, Integer> competitors){
    	String[] result = score.split(" ");
    	String[] men  = result[0].split("-");
    	String[] scores = result[1].split(":");
    	if(scores[0].equals(scores[1])){
    		competitors.put(men[0], competitors.get(men[0]) + 1);
    		competitors.put(men[1], competitors.get(men[1]) + 1);
    		return ;
    	}else{
    		String winner = Integer.valueOf(scores[0]) > Integer.valueOf(scores[1])? men[0]:men[1];
    		competitors.put(winner, competitors.get(winner) + 1);
    	}
    }
    //需要专门定制数据结构。
    
}