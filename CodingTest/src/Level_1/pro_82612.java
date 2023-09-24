package Level_1;

public class pro_82612 
{
	public static void main(String[] args) 
	{
		System.out.println(solution(3, 30, 4));
	}
	public static long solution(int price, int money, int count) 
	{
        long answer = 0;
        long sum = 0;
        
        for(int i = 1; i <= count; i++)
        {
        	sum += price * i;
        }
        if(sum > money)
        {
        	answer = sum - money;
        }
        return answer;
    }
}
