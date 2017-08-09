package com.day.demo;

public class Test {
	public static void main(String[] args) {
		Person person = new Person();
		try {
			person = new Person("汪先生",30,"");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("输入错误");
			e.printStackTrace();
		}finally{		
		person.print();
		}
	}
}
