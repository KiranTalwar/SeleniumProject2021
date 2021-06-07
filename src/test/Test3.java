package test;

public class Test3 {
	static Test3 t3=new Test3();
	static Test1 t1=new Test1();
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle();
		t3.square();
		Test1.scanme();
		t1.testme();
		
	}
	public static void  circle() {
		System.out.println("i am cicle method");
	}
    public void square() {
    	System.out.println("i am square method");
    }
}
