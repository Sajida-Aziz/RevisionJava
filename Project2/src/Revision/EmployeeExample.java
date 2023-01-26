package Revision;

public class EmployeeExample {
	static String companyname="mnc";
	String name;
	int id;
	
	public EmployeeExample(String name,int id)
	{
	this.name=name;
	this.id=id;
    }
	public void disp()
	{
		System.out.println("Name is "+name);
		System.out.println("Id is "+id);
		System.out.println("company name is "+companyname);
	}
	
	public static void main(String[] args) {
		EmployeeExample obj=new EmployeeExample("sam",123);
	    obj.disp();
		EmployeeExample obj1= new EmployeeExample("tim",345);
		obj1.disp();
		
		
		}

}
