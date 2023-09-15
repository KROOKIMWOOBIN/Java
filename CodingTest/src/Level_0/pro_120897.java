package Level_0;

public class pro_120897 
{
	public static void main(String[] args) 
	{

	}
	public int[] solution(int n) 
	{
        int count = 0;
        for(int i = 1; i <= n; i++)
        {
        	if(n % i == 0)
        	{
        		count++;
        	}
        }
        int[] answer = new int[count];
        count = 0;
        for(int i = 1; i <= n; i++)
        {
        	if(n % i == 0)
        	{
        		answer[count] = i;
        		count++;
        	}
        }
        return answer;
    }
}
