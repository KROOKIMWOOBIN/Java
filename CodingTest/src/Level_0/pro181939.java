package Level_0;

public class pro181939 {
	
	public static void main(String[] args) {
		System.out.println(solution(15, 10));
	}
	
	public static int solution(int a, int b) {
        int answer = 0;
        
        int chA = Integer.parseInt("" + a + b);
        int chB = Integer.parseInt("" + b + a);
        
        answer = chA > chB ? chA : chB;
        
        return answer;
    }
}
