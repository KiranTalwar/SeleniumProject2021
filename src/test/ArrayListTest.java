package test;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> tools= new ArrayList<String>();
		tools.add("Selenium");
		tools.add("testrail");
		tools.add("jira");
		tools.add("qtp");
		
		System.out.println(tools);

		System.out.println(tools.get(0));
		System.out.println(tools.get(1));
		System.out.println(tools.get(2));
		System.out.println(tools.get(3));
		
		tools.remove(1);
		//for(int i=0;i<=2;i++) {
			//System.out.println(tools.get(i));
		
		
		//for(int i=0;i<tools.size();i++) {
			//System.out.println(tools.get(i));
		
		
		for(String s:tools) {
			System.out.println(s);

	}
		
	}
}
