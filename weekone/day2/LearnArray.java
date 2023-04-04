package weekone.day2;

public class LearnArray {
	
public void findNumber()
{
	int count=0;
	int[] numbers ={1,5,7,8,9,0,4,5,2,3,11,21,32,5,23,67};
	for(int i=0;i<=numbers.length -1;i++)
	{
		if(numbers[i]==5)
		{
		 count= count+1;
		}
	}
	System.out.println("Number 5 present "+ count + " times in this array");
}

public static void main(String[] args) {
	LearnArray obj=new LearnArray();
	obj.findNumber();
	
}
}