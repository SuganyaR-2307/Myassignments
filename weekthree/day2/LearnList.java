package weekthree.day2;
import java.util.ArrayList;
import java.util.List;

public class LearnList {
	public static void main(String[] args) {
		
	
     List<String> list=new ArrayList<String>();
     list.add("Alpha");
     list.add("Sigma");
     list.add("Shrikanth");
     list.add("Delta");
     list.add("Gamma");
     list.add("Shilpa");
     
     //Print only the names starts with 'S' (Hint: string.startsWith())
     for(int i=0;i<list.size();i++)
     {
    	 
    			 if(list.get(i).startsWith("s"))
    			 {
    				 System.out.println(list.get(i));
    			 }
     }
     
     //Add "Pie" to the list
     
     list.add("Pie");
     
     //Find the size of the list
     
     System.out.println("Size of the List:"+list.size());
     //Add "Pie" Again and verify it is added
     list.add("Pie");
     for(int i=0;i<list.size();i++)
     {
    	 System.out.println(list.get(i));
     }
     
     //Insert "Choco" in the index 3
     list.add(3, "Choco");
     
     //Update "Sigma" -> "Zudio"
     
     list.set(1,"Zudio" );
    
     
     //. Remove "Pie" from the list
     
     list.remove("Pie");
     
	}
}
