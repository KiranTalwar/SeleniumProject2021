package test;

public class ReturnTypeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    printme();
    String a=hello();
    System.out.println(a);
    System.out.println(hello());
    int c=sum();
    System.out.println(c);
    System.out.println(sum());
	}
		
		public static void printme() {
        System.out.println("'i am in print");
	}
     public static String hello() {
    	
    	 String s="i am learning automation";
    	 return s;
    	  }
     public static int sum() {
    	 int q=4+6;
    	 return q;
}
}