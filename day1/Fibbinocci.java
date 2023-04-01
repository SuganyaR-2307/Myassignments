package weekone.day1;

public class Fibbinocci {
public static void main(String[] args) {
	int firstnum=0,secnum=1,sum=0;
	System.out.print(firstnum+" ");
	System.out.print(secnum+" ");
	for(int i=1;i<=11;i=i+1)
	{
		sum=firstnum+secnum;
		firstnum=secnum;
		secnum=sum;
		System.out.print(sum+" ");
		
	}
}
}
