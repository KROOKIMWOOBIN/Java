package BAEKJOON;

import java.util.Scanner;

public class problem_25305 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 사람 수
		int k = sc.nextInt(); // 상을 받을 사람 수
		int p[] = new int[n]; // 사람 점수
		int sw;
		for(int i = 0; i < n; i++) // 점수 입력
		{
			p[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				if(p[i] > p[j])
				{
					sw = p[i];
					p[i] = p[j];
					p[j] = sw;
				}
			}
		}
		System.out.println(p[k - 1]);
	}
}
