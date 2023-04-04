package weekone.day2;

public class Car {
	
	public void printCar()
	{
	System.out.println("SWIFT");

	}
	
	public int getRegNumber()
	{
		int regNumber = 4321;
	    return regNumber;
	}
	
	public void checkPunct()
	{
	boolean isPunc=true;
	   if (isPunc==true)
	    {
		System.out.println("Car is Puncter");
	    }
	}
	
	public int multipleNumbers(int num1,int num2,int num3)
	{
		int result=num1*num2*num3;
		return result;
	}
	public String getModel()
	{
		return "i10";
	}
public static void main(String[] args) {
	Car obj=new Car();
	obj.printCar();
	int regN =obj.getRegNumber();
	System.out.println(regN);
	obj.checkPunct();
	System.out.println(obj.multipleNumbers(3, 3, 3));
	String modelname=obj.getModel();
	System.out.println("Car Model Name "+modelname);
	
}
}
