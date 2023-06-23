package Level_0;

public class pro_181884 {
	public static int solution(int[] numbers, int n) {
        int answer = 0;
        
        for(int i = 0; i < numbers.length; i++) {
        	if(answer > n) {
        		break;
        	}
        	answer += numbers[i];
        }
        
        return answer;
    }
}
