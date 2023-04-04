package weekone.day1;

public class IsPrime {
public static void main(String[] args) {
	int n=14;
	int m;
	m=n/2;
	int flag=0;
	for(int i=2;i<=m;i=i+1)
	{
		if(n%i==0)
		{
			flag=1;
		}
		
	}
	if(flag==0)
	{
		System.out.println("Its prime number");
	}

	else if(flag==1)

	{
		System.out.println("It is not prime");
	}
}
}
