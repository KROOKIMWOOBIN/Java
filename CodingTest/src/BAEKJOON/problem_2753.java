package BAEKJOON;
import java.util.*;
public class problem_2753 
{
	static Scanner sc = new Scanner(System.in);
	public static int leap_year(int year) 
	{
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
		{
			return 1;
		}
		return 0;
	}
	public static void main(String[] args) 
	{
		int input = sc.nextInt();
		System.out.println(leap_year(input));
	}
}
