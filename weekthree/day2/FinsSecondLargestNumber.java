package weekthree.day2;

import java.util.Set;
import java.util.TreeSet;
import java.util.List;
import java.util.ArrayList;


public class FinsSecondLargestNumber {
	public static void main(String[] args) {
	
		int[] data = { 3, 2, 11, 4, 6, 7, 2, 3, 3, 6, 7 };
		
		System.out.println("********Find Secong Largest Number***********");
		Set<Integer> s = new TreeSet<Integer>();
		for (int i = 0; i < data.length; i++) {
			s.add(data[i]);
		}
			System.out.println(s);	
		  List<Integer> list=new ArrayList<Integer>(s); 
		  int len=list.size()-1;
		  for(int j=len;j>0;j--)
		  {
			  if(j==len-1)
			  {
				  System.out.println("SecondLargestNumber: "+list.get(j));
			  }
		  }
		  
		  
		}
}
