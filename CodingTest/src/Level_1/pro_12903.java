package Level_1;

public class pro_12903 
{
	public String solution(String s) 
	{
        String answer = "";
        
        System.out.println(s.length()/2);
        if(s.length() % 2 != 0)
        {
        	answer += String.valueOf(s.charAt(s.length()/2));
        }
        else
        {
        	answer = String.valueOf(s.charAt(s.length()/2 - 1)) + String.valueOf(s.charAt(s.length()/2));
        }
        return answer;
    }
}
