package Revision;

public class thisExample {
	
	public void methodA()
	{
		this.methodB();
		System.out.println("I m in method A");
	}

	 public void methodB()
	 {
		 System.out.println("I am in method B");
	 }
	public static void main(String[] args) {
		thisExample obj=new thisExample();
		obj.methodA();
		

	}

}
