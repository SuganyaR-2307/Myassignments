package weekthree.day1;

public class Student {
	public void getStudentInfo(int id)
	{
		System.out.println("Student ID: "+id);
	}
	public void getStudentInfo(long sid)
	{
		System.out.println("Student ID: "+sid);
		
	}
	public void getStudentInfo(String email,String phone)
	{
		System.out.println("Student Email: "+email+"Student PhoneNumber:"+phone);
	}
	public static void main(String[] args) {
		Student s=new Student();
		s.getStudentInfo(5463);
		s.getStudentInfo(7345);
		s.getStudentInfo("Sugan@13gmail.com","987-234-908" );
	}

}
