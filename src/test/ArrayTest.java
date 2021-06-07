package test;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String tool="Selenium";
    System.out.println(tool);
    
    String[] tools= {"Selenium","QTP","Testlink","Jira","Apple"};
   /* System.out.println(tools[0]);
    System.out.println(tools[1]);
    System.out.println(tools[2]);
    System.out.println(tools[3]);
    System.out.println(tools[4]);*/
    for(int i=0;i<=4;i++) {
    	
    	System.out.println(tools[i]);
    }
    	
    
    int[] numbers= {1,23,23,23,45,46};
    System.out.println(numbers[0]);
    System.out.println(numbers[1]);
    System.out.println(numbers[2]);
    System.out.println(numbers[3]);
    System.out.println(numbers[4]);
    
    
     Object[] general= {1,"hello",'d'};
     System.out.println(general[0]);
     System.out.println(general[1]);
     System.out.println(general[2]);
     
	}

}
