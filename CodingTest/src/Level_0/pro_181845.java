package Level_0;

public class pro_181845 {
	public static String solution(int n) {
        String answer = "";
        
        for(; n >= 1; n /= 10) {
        	answer += Integer.toString(n % 10);
        }
        String reverse = "";
        for (int i = answer.length() - 1; i >= 0; i--) {
            reverse = reverse + answer.charAt(i);
        }
        
        return answer = reverse;
    }
}
