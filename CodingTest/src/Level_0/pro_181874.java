package Level_0;

public class pro_181874 {
	public String solution(String myString) {
        String answer = "";
        
        myString = myString.toLowerCase();
        answer += myString.replace('a', 'A');
        
        return answer;
    }
}
