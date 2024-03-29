package Level_1;

public class pro_12932 {

	public int[] solution(long n) {
		
		int count = 0;
		long ch = 0;
		
		for(long i = n; i >= 1; i /= 10) {
			ch += i%10;
			ch *= 10;
			count++;
		}
		
		int answer[] = new int[count];
		count = 0;
		
		for(long i = n; i >= 1; i /= 10) {
			answer[count] = (int)(i%10);
			count++;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		new pro_12932().solution(1234567);
	}
}
