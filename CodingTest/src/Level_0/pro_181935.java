package Level_0;

public class pro_181935 
{
	public int solution(int n) 
	{
        int answer = 0;
        
        for(int i = 1; i <= n; i++)
        {
        	if(n % 2 != 0)
        	{
        		if(i % 2 != 0)
        		{
        			answer += i;
        		}
        	}
        	else
        	{
        		if(i % 2 == 0)
        		{
        			answer += i * i;
        		}
        	}
        }
        return answer;
    }

}
