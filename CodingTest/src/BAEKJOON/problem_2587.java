package BAEKJOON;

import java.util.Scanner;

public class problem_2587 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int numList[] = new int[5];
		int sum = 0, sw;
		for(int i = 0; i < 5; i++)
		{
			numList[i] = sc.nextInt();
			sum += numList[i];
		}
		for(int i = 0; i < 5; i++)
		{
			for(int j = 0; j < 5; j++)
			{
				if(numList[i] > numList[j])
				{
					sw = numList[i];
					numList[i] = numList[j];
					numList[j] = sw;
				}
			}
		}
		System.out.println(sum / 5);
		System.out.println(numList[2]);
		for(int i = 0; i < 5; i++)
		{
			System.out.print(numList[i] + " ");
		}
	}
}
