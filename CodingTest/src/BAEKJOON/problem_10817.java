package BAEKJOON;

import java.util.Scanner;

public class problem_10817 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int A, B, C;
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		if(A >= B && A <= C || A <= B && A >= C)
		{
			System.out.println(A);
		}
		else if(B >= A && B <= C || B <= A && B >= C)
		{
			System.out.println(B);
		}
		else 
		{
			System.out.println(C);
		}
	}
}
