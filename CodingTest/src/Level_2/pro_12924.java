package Level_2;

public class pro_12924 
{
	public static void main(String[] args) 
	{
		System.out.println(solution(15));
	}
	public static int solution(int n) 
	{
        int answer = 0;
        int num[] = new int[n + 1];
        
        for(int i = 1; i <= num.length - 1; i++)
        {
        	num[i] = i;
        	for(int j = i + 1; j <= num.length; j++)
        	{
        		System.out.println(num[i]);
        		if(num[i] == n)
        		{
        			answer++;
        			break;
        		}
        		if(num[i] <= n)
        		{
        			num[i] += j;
        		}
        		else
        		{
        			break;
        		}
        	}
        }
        return answer;
    }
}
