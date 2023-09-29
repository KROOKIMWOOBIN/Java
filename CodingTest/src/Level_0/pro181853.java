package Level_0;

public class pro181853 {
	public int[] solution(int[] num_list) {
        int[] answer = new int[5];
        int ch;
        for(int i = 0; i < num_list.length; i++) {
        	for(int j = i + 1; j < num_list.length; j++) {
        		if(num_list[j] < num_list[i]) {
        			ch = num_list[j];
        			num_list[j] = num_list[i];
        			num_list[i] = ch;
        		}
        	}
        }
        for(int i = 0; i < 5; i++) {
        	answer[i] = num_list[i];
        }
        return answer;
    }
}
