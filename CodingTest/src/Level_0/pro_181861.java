package Level_0;

public class pro_181861 {
	public int[] solution(int[] arr) {
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
        	for(int j = 1; j <= arr[i]; j++) {
        		count++;
        	}
        }
        int[] answer = new int[count];
        count = 0;
        for(int i = 0; i < arr.length; i++) {
        	for(int j = 1; j <= arr[i]; j++) {
        		answer[count] = arr[i];
        		count++;
        	}
        }
        return answer;
    }
}
