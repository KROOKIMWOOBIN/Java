package Level_1;

public class pro_12935 {

	public static int[] solution(int[] arr) {
		int[] answer = {};
		
		// 빈 배열 검사
		if(arr.length <= 1) {
			answer = new int[1];
			answer[0] = -1;
		}else {
			answer = new int[arr.length - 1];
		}
		
		// 가장 작은 수 찾기
		int min = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		// 숫자 대입
		int j = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != min) {
				answer[j] = arr[i];
				j++;
			}
		}
        
        return answer;
    }
	public static void main(String[] args) {
		int a[] = {-1, 4, 1, 2, 3};
		solution(a);
	}
}
