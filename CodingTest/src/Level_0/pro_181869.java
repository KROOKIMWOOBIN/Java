package Level_0;

public class pro_181869 {

	public static String[] solution(String my_string) {
		
		String answer[] = my_string.split("\\s");
		for(int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + " ");
		}
		return answer;
	}
	
	public static void main(String[] args) {
		solution("Hello My World");
	}

}
