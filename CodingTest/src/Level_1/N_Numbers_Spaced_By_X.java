package Level_1;

public class N_Numbers_Spaced_By_X {

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
		
		N_Numbers_Spaced_By_X NX = new N_Numbers_Spaced_By_X();
		NX.solution(-4, 2);
		
	}

}
