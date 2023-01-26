package Revision;

public class childB extends classParent {
	
	public void diff()
	{
		
		System.out.println(super.num1-super.num2);
	}
	@Override
	public void add()
	{   super.add();
		int sum=(super.num1+super.num2)*2;
		System.out.println(sum+"child class");
	}
	

	public static void main(String[] args) {
	
	childB obj=new childB();
	
	obj.add();
	obj.diff();
	
	}

}
