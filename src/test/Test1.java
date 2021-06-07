package test;

import selenium.Test4;

public class Test1 {
	 static Test1 t1= new Test1();
	 static Test2 t2= new Test2();
	 static Test3 t3 =new Test3();
	 static Test4 t4=new Test4();
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("I am in main");
    printme();
    scanme();
    t1.testme();
    t1.runme();
   Test2.red();
   t2.blue();
   Test3.circle();
   t3.square();
    Test4.car();
    t4.truck();
	}
    public static void printme() {
    	System.out.println("i am in printme");
    	
    }
    public static void scanme() {
    	System.out.println("i am in scan");
    }
    public void testme() {
    	System.out.println("i am in test");
    	
    }
    public void runme() {
    	System.out.println("i am in run");
    }
}

