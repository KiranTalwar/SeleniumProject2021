package test;

public class StringClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myName="Kiran";
		System.out.println(myName);
		String lastName="Talwar";
		System.out.println(lastName);
		
		System.out.println(myName + " " + lastName);
		
		String space=" ";
		System.out.println(myName+space+lastName);
		
		int a=100;
		int b=10;
		System.out.println(myName+lastName+a+b);
		System.out.println(myName+lastName+(a+b));
		System.out.println(a+b+myName+lastName);
		
        System.out.println(myName.indexOf("i"));
        
        
        
	}

}
 