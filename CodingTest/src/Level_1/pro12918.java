package Level_1;

public class pro12918 
{
	public boolean solution(String s) 
	{
		if(s.length() == 4 || s.length() == 6)
		{
			try 
	        {
	        	Integer.parseInt(s);
	        	return true;
	        }
	        catch (NumberFormatException e) {
				return false;
			}
		}
		else 
			return false;
    }
}