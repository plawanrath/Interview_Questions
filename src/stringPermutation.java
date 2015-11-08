import java.util.*;
//Another solution is sort the 2 strings and after sorting
//the sorted strings should be same.
public class stringPermutation {

	public boolean checkPermutations(String s1, String s2)
	{
		HashMap<Character, Boolean> testMap = new HashMap<Character, Boolean>();
		if(s1.length()==s2.length())
		{
			for(int i=0;i<s1.length();i++)
				testMap.put(s1.charAt(i), true);
			for(int j=0;j<s2.length();j++)
			{
				if(!testMap.containsKey(s2.charAt(j)))
					return false;
			}
			return true;
		}
		else
			return false;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter 2 strings");
		String s1 = in.nextLine();
		String s2 = in.nextLine();
		stringPermutation sp = new stringPermutation();
		if(sp.checkPermutations(s1, s2))
			System.out.println("They are permutations!!");
		else
			System.out.println("They are not permutations!");
		// TODO Auto-generated method stub

	}

}