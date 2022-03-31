// Reverse the String

class Wordrev
{
	public static void main (String args[])
	{
		String s = "ab cd ef gh ij kl";
		String t = "";
		int n = s.length();
		for (int i=n-1;i>=0;i--)
		{
			t = t+s.charAt(i);
		}
		System.out.println(s);
		System.out.println(t);
	}
}	
