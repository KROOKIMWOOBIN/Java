package Level_0;

public class pro_181889 {

	  public static int[] solution(int[] num_list, int n) {
		  int[] answer = new int[n];
	        
	      for(int i = 0; i < n; i++){
	          answer[i] = num_list[i];
	      }
	        
	      return answer;
	  }
	
	public static void main(String[] args) {
		pro_181889 pr181889 = new pro_181889();
		int a[] = {1, 2, 3};
		pr181889.solution(a, 3);
	}

}
