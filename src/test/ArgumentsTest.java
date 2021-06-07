package test;

public class ArgumentsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int r=sum();
    System.out.println(r);
    System.out.println(sum());
    
    int k=sum(6,9);
    System.out.println(k);
    
    int f=sum(4,7,9);
    System.out.println(f);
    
	}
    public static int sum() {
    	int d=4+7;
		return d;
    }
    public static int sum(int x,int y) {
    	int z=x+y;
    	return z;
    	 }
    public static int sum(int x,int y, int z) {
    	int d=x+y+z;
		return d;
    	
    }
}
