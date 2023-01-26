package Revision;

public class CountChar {

	public static void main(String[] args) {
		String s1="Hello World";
		int count=0;
		System.out.println("Length of string is"+s1.length());
		for (int i=0;i<s1.length();i++)
		{
			System.out.print(s1.charAt(i));
			count++;
			/*char c=s1.charAt(i);
			if(c =="")
			{
				count++;
			}
				*/
			
		
	}
		System.out.println(count);
	}

		

	}


