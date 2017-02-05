package algorithmTest.basic.easy_1;

public class ReverseNum {
	
	//�ַ�������ʱ����ִ��󡣣�δ����Խ�����⣩
	 public int reverse(int x) {
	        String tmp  = Integer.toString(x);
	        StringBuilder sb = new StringBuilder();
	        int start = 0;
	        if(tmp.charAt(0) == '-'){
	        	sb.append("-");
	        	start =  1;
	        }else{
	        	start = 0;
	        }
	        for(int i = tmp.length() - 1; i >= start;i--){
	        	sb.append(tmp.charAt(i));
	        }
	        return Integer.parseInt(sb.toString().replaceAll("\\s*", ""));
	    }
	 
	 //int �ķ�Χ�� ���޵ġ�(overflow����)
	 public int reverse2(int x) {
		 int rest = x;
		 int result = 0;
		 int preResult = 0;
		 while(rest !=0 ){
			 result = result*10 + rest%10;
			 //��Ϊ�Ƿ񳬳�int ��Χ�����ݣ������������0.
			 if(result/10  != preResult){
				 return 0;
			 }
			 preResult = result;
			 rest = rest/10;
		 }
		 return result;
	 }
}
