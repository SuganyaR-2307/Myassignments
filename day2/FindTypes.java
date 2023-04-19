package Weektwo.day2;

public class FindTypes {
	public static void main(String[] args) {
		String str="$$ Welcome to 2nd Class of Automation $$ ";
		int letter=0,space=0,num=0,specialChar=0;
	// Convert the String to character array
		char[] cArray=str.toCharArray();
	//Traverse through each character (using loop)
		for(int i=0;i<str.length();i++)
		{
			if(Character.isLetter(cArray[i])==true)
			{
				letter=letter+1;
			}
			else if(Character.isDigit(cArray[i])==true)
			{
				num=num+1;
			}
			else if(Character.isSpaceChar(cArray[i])==true)
			{
				space+=1;
			}
			else
			{
				specialChar+=1;
			}
		}
		System.out.println("No of Letter:"+letter);
		System.out.println("No of Digits:"+num);
		System.out.println("No of Spaces:"+space);
		System.out.println("No of Special Charcter:"+specialChar);
	}

}
