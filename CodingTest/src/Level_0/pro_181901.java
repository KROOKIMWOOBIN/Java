package Level_0;

public class pro_181901 {
	public static int[] solution(int n, int k) {
        
		int[] answer = new int[n / k];
		int count = 0;
		
		for(int i = k; i <= n; i += k) {
			answer[count] = i;
			count++;
        }
		return answer;
    }
}
