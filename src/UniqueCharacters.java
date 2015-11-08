import java.util.*;
public class UniqueCharacters {

	public int string_uniques_without_Hash(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i) == s.charAt(j))
					return 0;
			}
		}
		return 1;
	}
	
	public int string_unique_With_Hash(String s)
	{
		HashMap<Character,Boolean> myMap = new HashMap<Character,Boolean>();
		for(int i=0;i<s.length();i++)
		{
			if(myMap.containsKey(s.charAt(i)))
				return 0;
			else
				myMap.put(s.charAt(i), true);
		}
		return 1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		UniqueCharacters us = new UniqueCharacters();
		int res = us.string_unique_With_Hash(input);
		System.out.println("Using HashMaps\n");
		if(res == 0)
		{
			System.out.println("THe string doesn't have uniques!!\n");
		}
		else
		{
			System.out.println("The String has uniques\n");
		}
		int res1 = us.string_uniques_without_Hash(input);
		System.out.println("Without using any Data Structures\n");
		if(res == 0)
		{
			System.out.println("THe string doesn't have uniques!!\n");
		}
		else
		{
			System.out.println("The String has uniques\n");
		}		
		}

}
