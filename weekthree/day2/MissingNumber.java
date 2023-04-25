package weekthree.day2;

import java.util.Set;
import java.util.TreeSet;
import java.util.List;
import java.util.ArrayList;

public class MissingNumber {
public static void main(String[] args) {
	int[] num= {1,4,3,4,5,2,7,9,7};
	Set<Integer> set=new TreeSet<Integer>();
	for(int i=0;i<num.length;i++)
	{
		set.add(num[i]);
	}
	
	List<Integer> list=new ArrayList<Integer>(set);
	System.out.println(list);
	for(int i=0;i<list.size();i++)
	{
		
	  if(!(list.get(i)+1==list.get(i+1)))
		{
		  
			  System.out.println(list.get(i)+1);
		 
		}
	  
		
		
	}
}
}
