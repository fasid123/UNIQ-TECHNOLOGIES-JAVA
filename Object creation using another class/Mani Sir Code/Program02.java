class Students
{
	int id;
	String name;
	String department;
	static String collegeName;
	
	static void displayStudentDetails(Students obj)// obj = s1 // obj = s2
	{
		System.out.println(obj.id);
		System.out.println(obj.name);
		System.out.println(obj.department);
	}
	
	
	
	static int add()
	{
		return 20;
	}
	
	static Students createNewStudentObject()
	{
		Students obj = new Students();
	
		return obj;
	}
}

class Program02 
{
	public static void main(String[] args) 
	{
		Students.collegeName = "bdf";
		
		System.out.println(Students.collegeName);
		
		Students s1 = Students.createNewStudentObject();	
		
		int x = Students.add();
		
		
		s1.id = 101;
		s1.name = "raja";
		s1.department = "MCA";

		Students.displayStudentDetails(s1);
		
		Students s2 = Students.createNewStudentObject();	
		
		s2.id = 101;
		s2.name = "raja";
		s2.department = "MCA";
		
		Students.displayStudentDetails(s2);
		
	}
}
