package weekone.day2;

public class PrintDuplicatesInArray {
public static void main(String[] args) {
	int[] array= {14,12,13,11,15,14,18,16,17,19,18,17,20};
	int count=array.length;
	System.out.println("Print Duplicates in Array");
	for(int i=0;i<count;i++)
	{
		for(int j=i+1;j<count;j++)
		{
			if(array[i]==array[j])
			{
				System.out.println(array[i]);
			}
		}
	}
}
}
