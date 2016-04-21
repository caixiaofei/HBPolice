package com.test;

public class person {
	private String name;
	private int age;
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s= "";
		System.out.println(s.toString());
		
		person p = new person();
		p.setAge(25);
		p.setName("caifei");
		System.out.println(p.toString());
		

	}

}
