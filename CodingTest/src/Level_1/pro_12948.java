package Level_1;

public class pro_12948 
{
	public String solution(String phone_number) 
	{	
        String answer = "";
        for(int i = 0; i < phone_number.length() - 4; i++)
        {
        	answer += "*";
        }
        answer += phone_number.substring(phone_number.length() - 4, phone_number.length());
        return answer;
    }
}
