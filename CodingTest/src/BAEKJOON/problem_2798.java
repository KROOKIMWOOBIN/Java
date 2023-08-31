package BAEKJOON;

import java.util.Scanner;

public class problem_2798 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("CardSize >>> ");
        int n = sc.nextInt();
        System.out.print("Card sum >>> ");
        int m = sc.nextInt();
        int[] cards = new int[n];
        for (int i = 0; i < n; i++) 
        {
        	System.out.print(i + "nd card input >>> ");
            cards[i] = sc.nextInt();
        }

        int max = 0;
        for (int i = 0; i < n - 2; i++) 
        {
            for (int j = i + 1; j < n - 1; j++) 
            {
                for (int k = j + 1; k < n; k++) 
                {
                    int sum = cards[i] + cards[j] + cards[k];
                    if (sum <= m && sum > max) 
                    {
                        System.out.println(cards[i] + " " + cards[j] + " " + cards[k]);
                    }
                }
            }
        }
    }
}
