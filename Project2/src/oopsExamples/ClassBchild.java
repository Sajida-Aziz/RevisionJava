package oopsExamples;

public class ClassBchild extends ClassAParent{
	
	public void disp()
	{
		super.disp();
		System.out.println("In method child with parents variable "+x);
	}

	public static void main(String[] args) {
		ClassAParent obj;
		obj=new ClassBchild();
		obj.disp();
		//ClassBchild obj=new ClassBchild();
		//obj.disp();

	}

}
