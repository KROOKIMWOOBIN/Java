package Level_1;

public class pro_12916 {
	
	public boolean solution(String s) {
		boolean answer = true;
		int p = 0;
		int y = 0;
		
		for(int i = 0; i < s.length(); i++) {
			String c = Character.toString(s.charAt(i));
			if(c.equals("p") || c.equals("P")) {
				p++;
			}else if(c.equals("y") || c.equals("Y")) {
				y++;
			}
		}

		if(p != y) {
			answer = false;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(new pro_12916().solution("PypyY")); 
	}
	
}
