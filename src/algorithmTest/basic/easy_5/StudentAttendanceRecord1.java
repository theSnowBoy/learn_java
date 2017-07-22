package algorithmTest.basic.easy_5;

public class StudentAttendanceRecord1 {
    public boolean checkRecord(String s) {
        char[] attendance = s.toCharArray();
        int countA = 0;
        int continuousB = 0;
        for(char oneDay : attendance){
        	if(oneDay == 'P'){
        		continuousB = 0;
        	}else if(oneDay == 'A'){
        		countA ++;
        		continuousB = 0;
        		if(countA > 1){
        			break;
        		}
        	}else{
        		continuousB ++;
        		if(continuousB > 2){
        			break;
        		}
        	}
        }
        return !(countA > 1 || continuousB >2);
    }
}
