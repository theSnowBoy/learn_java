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
	//���� ���������м���ȡ
	Json tmp = new Json();
	if(jsonStr.charAt(index) == ':'){
		tmp.key = pre;
		
	}
	
	//1.����","����ͬһ��ε�json.������ֵ�ô�ȡ��
	if(jsonStr.charAt(index) == ','){
		
	}
	//2.������{��������һ�㡣
	
	//3.������}��������һ�㡣
	return null;
}
}
