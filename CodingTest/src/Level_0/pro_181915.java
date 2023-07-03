package Level_0;

public class pro_181915 {
	public String solution(String my_string, int[] index_list) {
        String answer = "";
        
        for(int i = 0; i < index_list.length; i++){
            for(int j = 0; j <= index_list[i]; j++){
                if(j == index_list[i]){
                    answer += my_string.charAt(j);
                }
            }
        }
        
        return answer;
    }
}
