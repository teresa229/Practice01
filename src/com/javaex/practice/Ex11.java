package com.javaex.practice;

import java.util.Scanner;

public class Ex11 { //해결
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월급을 입력하세요:");
		int money = sc.nextInt();
		int pay = money*10*12;
		
	//	System.out.println(money);
		
		System.out.println("10년동안 최대 저축액은 " + pay +"원입니다.");
		
		sc.close();
	}

}
