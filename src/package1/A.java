package package1;
import package2.*; 

public class A {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C c = new C(); 
		//System.out.println(c.defaultMessage); 
		System.out.println(c.publicMessage); 

	}
	
	B b = new B(); 
	//can't see private messages from here


}
