package com.day12;

import java.util.Vector;

class Test{
	
	String name;
	int age;
	
}

public class Test8 {

	public static void main(String[] args) {

		Vector<Test> v = new Vector<>();
		
		Test ob;
		ob = new Test();
		ob.name = "�����";
		ob.age = 27;
		v.add(ob);
		
		ob = new Test();
		ob.name = "���γ�";
		ob.age = 41;
		v.add(ob);
		
		for(Test t : v) {
			
			System.out.println(t.name + ":" +t.age);
		}
		
		
		
	}

}