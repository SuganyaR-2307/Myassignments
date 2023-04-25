package weekthree.day2;
import java.util.HashSet;
import java.util.Set;



public class UniqueCharacter {
	public static void main(String[] args) {
		String name="babu";
		char[] ch=name.toCharArray();
		
		Set<Character> set=new HashSet<Character>();
		for(int i=0;i<ch.length;i++)
		{
			
			if(!set.contains(ch[i]))
			{
			set.add(ch[i]);
			}
			else
			{
				set.remove(ch[i]);
			}
		
		}
		System.out.print(set);
		
	}

}
