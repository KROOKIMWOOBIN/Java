package Level_1;

import java.util.Stack;

public class pro_12906 
{
	public static void main(String[] args) 
	{
		int[] n = {1,1,3,3,0,1,1};
		solution(n);
	}
	public static int[] solution(int []arr) {
		
        Stack<Integer> stack = new Stack<>();

        stack.add(arr[0]);
        for(int i = 1; i < arr.length; i++)
        {
        	if(arr[i] != arr[i - 1])
        	{
        		stack.add(arr[i]);
        	}
        }
        
        int[] answer = new int[stack.size()];
        
        for(int i = stack.size() - 1; i >= 0; i--)
        {
        	answer[i] = stack.peek();
        	stack.pop();
        }
        return answer;
    }
}
