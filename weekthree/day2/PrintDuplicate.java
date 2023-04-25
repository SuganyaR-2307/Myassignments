package weekthree.day2;
import java.util.Set;
import java.util.HashSet;

public class PrintDuplicate {
   public static void main(String[] args) {
	   int[] data = {4,3,6,8,29,1,2,4,7,8};
	   System.out.println("Numbers: 4,3,6,8,29,1,2,4,7,8");
	   System.out.println("***Print Duplicate Numbers***");
	   Set<Integer> unique=new HashSet<Integer>();
	   Set<Integer> duplicate=new HashSet<Integer>();
	   for(int i=0;i<data.length;i++)
	   {
		   if(!unique.contains(data[i]))
		   {
			  unique.add(data[i]);
		   }
		   else
		   {
			   duplicate.add(data[i]);
		   }
		   
	   }
	   System.out.println("Duplicate Number:");
	   for(Integer eachvalue:duplicate)
	   {
	   System.out.println(eachvalue);
	   }
}
}
