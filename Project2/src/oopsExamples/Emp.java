package oopsExamples;

public class Emp {
	int id;  
	String name;  
	AggreExam1  address;  
	  
	public Emp(int id, String name,AggreExam1  address) {  
	    this.id = id;  
	    this.name = name;  
	    this.address=address;  
	}  
	  
	void display(){  
	System.out.println(id+" "+name);  
	System.out.println(address.city+" "+address.state+" "+address.country);  
	}  
	  
	public static void main(String[] args) {  
		AggreExam1  address1=new AggreExam1 ("gzb","UP","india");  
		AggreExam1  address2=new AggreExam1 ("gno","UP","india");  
	  
	Emp e=new Emp(111,"varun",address1);  
	Emp e2=new Emp(112,"arun",address2);  
	      
	e.display();  
	e2.display();  
	      
	}  
	}  


