package Level_1;

public class pro_12947 
{
	public static boolean solution(int x) 
	{
        boolean answer = true;
        int sum = 0, ch = x;
        while(ch >= 1) 
        {
        	sum += ch % 10;
        	ch = ch / 10;
        }
        if(x % sum != 0)
        {
        	answer = false;
        }
        return answer;
    }
	public static void main(String[] args) 
	{
		System.out.println(solution(13));
	}
}
