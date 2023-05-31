package Level_1;

public class A_Knights_Weapon {

	int A_Knights_Weapon(int number, int limit, int power) {
		int answer = 0;
		
		for(int i = 1; i <= number; i++) 
		{
			int count = 0;
			
			for(int j = 1; j * j <= i; j++)
			{
				if(j * j == i) 
				{
					count += 1;
				}
				else if(i % j == 0) 
				{
					count += 2;
				}
			}
			answer += count > limit ? power : count;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		A_Knights_Weapon akw = new A_Knights_Weapon();
		akw.A_Knights_Weapon(5, 3, 2);
	}

}
