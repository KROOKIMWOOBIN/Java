package BAEKJOON;

import java.io.*;

public class problem_27433 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		System.out.println(factorial(num));
	}
	public static long factorial(int num)
	{
		if(num <= 1) return 1;
		return num * factorial(num - 1);
	}
}
