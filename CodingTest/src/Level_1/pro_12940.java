package Level_1;

public class pro_12940 
{
	public int[] solution(int n, int m) 
	{
        int[] answer = {0, 0};
        
        for(int i = 1; i <= m; i++) // 최대공약수 완성
        {
        	if(n % i == 0 && m % i == 0) // n이랑 m을 약분해서 0이 되는 가장 큰 수 찾음
        	{
        		answer[0] = i;
        	}
        }
        answer[1] = (n * m) / answer[0]; // a와 b를 곱하여 최대공약수로 나눈다.
        
        return answer;
    }
}
