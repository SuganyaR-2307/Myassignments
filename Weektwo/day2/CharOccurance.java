package Weektwo.day2;

public class CharOccurance {
public static void main(String[] args) {
	String str="welcome to chennai";
	int count=0;
	char c='e';
	char[] chr=str.toCharArray();
	int length=str.length();
	System.out.println(length);
	
	for(int i=0;i<length-1;i++)
	{
		
		if(chr[i]==c)
		{
		 count=count+1;
		}
	}
	System.out.println(count);
}
}
