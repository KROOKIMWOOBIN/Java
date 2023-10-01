package Level_0;

public class pro_181878 {
	public static void main(String args[]) {
		System.out.println(solution("AbCdEfG", "aBc"));
	}
	
	public static int solution(String myString, String pat) {
		myString = myString.toUpperCase();
		pat = pat.toUpperCase();
		int answer = 0,  count = 0;
        for(int i = 0; i < myString.length(); i++) {
        	if(count == pat.length()) {
        		break;
        	}
        	if(myString.charAt(i) == pat.charAt(count)) {
        		count++;
        	}
        	else {
        		count = 0;
        	}
        }
        if(count == pat.length()) {
        	answer = 1;
        }
        return answer;
    }
}
