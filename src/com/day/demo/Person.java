package com.day.demo;

public class Person {
	private String name = "无名氏";
	private int age =0;
	private String sex="男";
	public Person(){
		
	}
	public Person(String name, int age, String sex) throws GenderException,AgeException {		
		this.name = name;
		if(age>1&&age<100){
			this.age = age;
		}else{
			throw new AgeException("只能输入1到100之间的数");
		}
		if("男".equals(sex)||"女".equals(sex)){
			this.sex = sex;
		}else{
			throw new GenderException("性别只能是输入男或者女");
		}
		
	}
	public void print(){
		System.out.println("姓名是"+this.name+"年龄是："+this.age+"性别是："+this.sex);
	}
	
}
