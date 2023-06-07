package Level_0;

public class pro_181899 {

	public static int[] solution(int start, int end) {
        int[] answer = new int[start - end + 1];
        int ch = start;
        for(int i = 0; i <= start - end; i++) {
        	answer[i] = ch;
        	System.out.print(answer[i] + " ");
        	ch--;
        }
       
        return answer;
    }
	
	public static void main(String[] args) {
		solution(10, 3);
	}

}
