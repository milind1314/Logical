public class Reverse 
{
	public static String reverseString(String str) 
	{
		str = str.trim();

		String[] words = str.split("\\s+");
		
		int left = 0, right = words.length - 1;

		while(left < right)
		{
			String temp = words[left];
			words[left] = words[right];
			words[right] = temp;
			left++;
			right--;
		}


		return String.join(" ", words );
	}
}
