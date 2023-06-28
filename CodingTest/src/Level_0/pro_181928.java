package Level_0;

public class pro_181928 {
	public static int solution(int[] num_list) {
        int answer = 0;
        
        String sum1 = "", sum2 = "";
        
        for(int i = 0; i < num_list.length; i++) {
        	if(num_list[i] % 2 == 0) {
        		sum1 += Integer.toString(num_list[i]);
        	}else {
        		sum2 += Integer.toString(num_list[i]);
        	}
        }
        
        return answer = Integer.parseInt(sum1) + Integer.parseInt(sum2);
    }
}
