package Weektwo.day2;

public class ReverseEvenWords {
	public static void main(String[] args) {
		String str="I am a software tester";
		String[] s=str.split("\\s");
		String string="";
		System.out.println("***********REVERSE WORD***********");
		System.out.println("Before Reverse: "+str);
		for(int i=0;i<s.length;i++)
		{
			String rev="";
			int mod=i+1;
			if((mod%2)==0)
			{
				String[] s1=s[i].split("");
				int len=s1.length-1;
				for(int j=len;j>=0;j--)
				{
				   rev=rev.concat(s1[j]);
				  
				}
				string=string.concat(rev);
			
			}
			else
			{
				string=string.concat(s[i]);
				
				
			}
			string=string.concat(" ");
		}
		System.out.println("After Reverse: "+string);
	}

}
