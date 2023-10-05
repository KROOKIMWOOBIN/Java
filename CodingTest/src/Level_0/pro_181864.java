package Level_0;

public class pro_181864 {
	public static void main(String[] args) {
		System.out.println(solution("ABBAA", "AABB"));
	}
	public static int solution(String myString, String pat) {
        int answer = 0;
        String chMyString = "";
        for(int i = 0; i < myString.length(); i++) {
        	if(myString.charAt(i) == 'A') {
        		chMyString += "B";
        	}
        	else {
        		chMyString += "A";
        	}
        }
        if(chMyString.contains(pat)) {
        	answer = 1;
        }
        return answer;
    }
}
