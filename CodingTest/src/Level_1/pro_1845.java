package Level_1;

import java.util.HashSet;

public class pro_1845 {
	public static void main(String[] args) 
	{
		int[] nums = {1,1,2,3};
		System.out.println(solution(nums));
	}
	public static int solution(int[] nums) 
	{
        int answer = 0;
		HashSet<Integer> set = new HashSet<>();
		for(int i = 0; i < nums.length; i++)
		{
			if(set.size() < nums.length/2)
			{
				if(!set.contains(nums[i]))
				{
					set.add(nums[i]);
				}
			}
		}
        return answer = set.size();
    }
}
