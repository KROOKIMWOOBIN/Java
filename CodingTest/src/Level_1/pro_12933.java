package Level_1;

import java.util.*;

public class pro_12933 
{
	public static void main(String[] args) 
	{
		System.out.println(solution(1423));
	}
	public static long solution(long n) 
	{
        long answer = 0;
        
        ArrayList<Long> al = new ArrayList<>();
        
        for(long i = n; i > 0; i/=10)
        {
        	al.add(i%10);
        }
        
        Collections.sort(al);
        
        int plus = 1;
        
        for(int i = 0; i < al.size(); i++)
        {
        	answer += al.get(i) * plus;
        	plus *= 10;
        }
        
        return answer;
    }
}
