package Level_0;

public class pro_181849 {
	public static int solution(String num_str) {
        int answer = 0;
        for(int i = 0; i < num_str.length(); i++) {
        	
        	answer += num_str.charAt(i) - 48;
        }
        
        return answer;
    }
	public static void main(String[] args) {
		System.out.println(solution("123412"));
	}
}
