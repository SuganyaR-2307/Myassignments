package weekthree.day2;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ArrayList;
public class RemoveDuplicateWords {
	public static void main(String[] args) {
		String str="we learn java basics as part of	java sessions in java week1";
		String[] str1=str.split("\\s");
		System.out.println("********Before Removing Duplicate Words*********");
		System.out.println(str);
		Set<String> set=new LinkedHashSet<String>();
		for(int i=0;i<str1.length;i++)
		{
			set.add(str1[i]);
		}
		System.out.println("********After Removing Duplicate Words*********");
		List<String> list=new ArrayList<String>(set);
		for(int i=0;i<list.size();i++) 
		{
		   System.out.print(list.get(i));
		   System.out.print(" ");
		}
		
	}

}
