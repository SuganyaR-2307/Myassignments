package weekthree.day1;

public class MyPhonee {
	public static void main(String[] args) {
		SmartPhone s=new SmartPhone();
		System.out.println("Created object for SmartPhone Class and accessing the methods of CellPhone Class and Phone Class(Grand Parent class and Parent Class");
		s.takePicture();
		s.listenMusic();
		s.makeCall();
		s.sendMessage();
		s.receiveMessage();
		s.receiveCall();
		CellPhone c=new CellPhone();
		System.out.println("Created object for CellPhone and accessing the methods of Phone Class(Parent class of CellPhone) ");
	    c.makeCall();
		c.receiveCall();
		c.sendMessage();
		c.receiveMessage();
		
		
	}

}
