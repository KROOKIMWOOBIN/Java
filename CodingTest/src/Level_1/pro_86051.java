package Level_1;

public class pro_86051 
{
    public int solution(int[] numbers) 
    {
        int answer = 45;
        for(int i : numbers)
        {
        	answer -= i;
        }
        return answer;
    }
}
