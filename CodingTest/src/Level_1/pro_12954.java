package Level_1;

public class pro_12954 {

	public long[] solution(int x, int n) {
		long[] answer = new long[n];
		long sum = x;
		for(int i = 0; i < n; i++) {
			answer[i] = sum;
			sum += x;
			System.out.println(answer[i]);
		}
			
		return answer;
	}
	
	public static void main(String[] args) {
		
		pro_12954 NX = new pro_12954();
		NX.solution(-4, 2);
		
	}

}
