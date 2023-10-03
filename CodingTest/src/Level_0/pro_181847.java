package Level_0;

public class pro_181847 {
	public String solution(String n_str) {
        String answer = "";
        boolean senser = false;
        for(int i = 0; i < n_str.length(); i++) {
        	if(n_str.charAt(i) != '0') {
        		senser = true;
        	}
        	if(senser == true) {
        		answer += n_str.charAt(i);
        	}
        }
        
        return answer;
    }
}
