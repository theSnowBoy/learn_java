import java.util.LinkedList;
import java.util.List;

public class InterView {
public static class Json{
	public String key;
	public String value;
	public List<Json> sons;
}
public static List<Json> format(String pre,String jsonStr,int index){
	
	List<Json> result = new LinkedList<>();
	//遇到 “：”进行键存取
	Json tmp = new Json();
	if(jsonStr.charAt(index) == ':'){
		tmp.key = pre;
		
	}
	
	//1.根据","区别同一层次的json.（进行值得存取）
	if(jsonStr.charAt(index) == ','){
		
	}
	//2.遇到“{”向下走一层。
	
	//3.遇到“}”往上走一层。
	return null;
}
}
