package Weektwo.day2;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String str1="stops";
		String str2="potss";
		System.out.println("***********Anagram*********");
		int l1=str1.length();
		int l2=str2.length();
		
		if(l1==l2)
		{
			char[] ch1=str1.toCharArray();
			char[] ch2=str2.toCharArray();
		    Arrays.sort(ch1);
		    Arrays.sort(ch2);
		    int count=0;
		  
		    for(int i=0;i<ch1.length;i++)
		    {
		    	
		    		if(ch1[i]==ch2[i])
		    		{
		    		count=count+1;
		    		}
		    
		    }
		    if(count==ch1.length)
		    {
		    	System.out.println("Both String has same characters");
		    }
		    else
		    {
		    	System.out.println("Both has different characters");
		    }
		    
		}
	}

}
