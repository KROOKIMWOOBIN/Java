package Level_0;

public class pro_181933 {

	public static int solution(int a, int b, boolean flag) {
		int answer = 0;
		if(flag == true) {
			answer = a + b;
		}else {
			answer = a - b;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(10, 5, false));
	}

}
