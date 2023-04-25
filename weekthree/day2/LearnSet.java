package weekthree.day2;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
public class LearnSet {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("Shakthi");
		list.add("George");
		list.add("Arun");
		list.add("Chandru");
		list.add("Eshwar");
		list.add("Bala");
		list.add("Farook");
		list.add("Arun");
		list.add("Bala");
		//Print only the Duplicate values [Arun & Bala]
		System.out.println("Duplicate Name in List:");
		for(int i=0;i<list.size();i++)
		{
			for(int j=i+1;j<list.size();j++) 
			{
			  if(list.get(i).contains(list.get(j)))
			   {
				System.out.println(list.get(i));
			    }
		    }
		}
		
		//2.TreeSet implementation Class
		//Print only the unique values
	
		System.out.println("Print Unique value Using TreeSet:");
		Set<String> s=new TreeSet<String>(list);
		for(String eachvalue:s)
		{
			
			System.out.println(eachvalue);
			
		}
			
		//1.HashSet implementation class
	    Set<String> h=new HashSet<String>();
	    h.addAll(list);
	    System.out.println("Convert List to Set using HashSet Implementation Class");
	    for(String eachvalue:h)
	     {
	    	
		   System.out.println(eachvalue);
	     
	    }
	    
	    
	  //3.LinkedHashSet implementation Class
	    Set<String> lh=new LinkedHashSet<String>(list);
	    System.out.println("Convert List to Set using LinkedHashSet Implementation Class");
	    for(String eachvalue:lh)
	     {
		System.out.println(eachvalue);
	     }
	    
	}

}
