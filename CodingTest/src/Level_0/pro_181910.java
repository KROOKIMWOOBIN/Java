package Level_0;

public class pro_181910 {

	public static String solution(String my_string, int n) {
        String answer = "";
        
        for(int i = my_string.length() - n; i < my_string.length(); i++) {
        	answer += my_string.charAt(i);
        }
        
        return answer;
    }
}
