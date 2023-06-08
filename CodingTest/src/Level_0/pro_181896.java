package Level_0;

public class pro_181896 {

	public static int solution(int[] num_list) {
		int answer = 0;
		
		for(int i = 0; i < num_list.length; i++) {
			if(num_list[i] < 0) {
				answer = i;
				break;
			}
			answer = -1;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		int list[] = {12, 4, 15, 46, 38, -2};
		System.out.println(solution(list));
	}

}
