import java.util.*;
import java.util.Map.Entry;
public class compressedString {

	public String getCompressed(String s)
	{
		String temp = s.toLowerCase();
		Stack<Character> compressionStack = new Stack<Character>();
		int index = 0;
		String finalString;
		char stackValue = 0;
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<temp.length();i++)
		{
			char x = temp.charAt(i);
			if(compressionStack.isEmpty())
			{
				stackValue = 0;
			}
			else
			{
				stackValue = compressionStack.pop();
			}
			if(stackValue == 0)
			{
				index++;
				compressionStack.push(x);
			}
			else if(stackValue == x)
			{
				index++;
				compressionStack.push(x);
			}
			else
			{
				sb.append(stackValue);
				sb.append(index);
				//finalString = finalString + stackValue + index;
				index = 1;
				compressionStack.push(x);
			}
		}
		sb.append(stackValue);
		sb.append(index);
		finalString = sb.toString();
		return finalString;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string to compress:");
		String input = in.nextLine();
		compressedString cs = new compressedString();
		System.out.println(cs.getCompressed(input));
	}

}
