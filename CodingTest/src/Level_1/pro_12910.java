package Level_1;

import java.util.ArrayList;
import java.util.Collections;

public class pro_12910 
{
	public static void main(String[] args) 
	{
		int list[] = {5, 9, 7, 10}, num = 5;
		solution(list, num);
	}
	public static int[] solution(int[] arr, int divisor) 
	{
        int[] answer = {};
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0; i < arr.length; i++)
        {
        	if(arr[i] % divisor == 0)
        	{
        		al.add(arr[i]);
        	}
        }
        answer = new int[al.size()];
        Collections.sort(al);
        for(int i = 0; i < al.size(); i++)
        {
        	answer[i] = al.get(i);
        }
        if(answer.length == 0)
        {
        	answer = new int[1];
        	answer[0] = -1;
        }
        return answer;
    }
}
