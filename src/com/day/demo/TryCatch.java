package com.day.demo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try{
		System.out.print("请输入被除数：");
		int num1 = input.nextInt();
		System.out.print("请输入除数：");
		int num2 = input.nextInt();
		System.out.println(String.format("%d/%d=%d", num1,num2,num1/num2));
		}catch(InputMismatchException e){
			System.err.println("输入的数必须为整数，并且除数不能为零");			
			e.printStackTrace();
			System.out.println("异常信息："+e.getMessage());
			System.exit(1);
		}catch(ArithmeticException e){
			System.out.println(" 除数不能为零。");
		}catch(Exception e){
			System.out.println(" 其他未知异常。");
		}finally{
			System.out.println("感谢使用本程序!");
		}				
	}
}
