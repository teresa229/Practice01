package com.javaex.practice;

import java.util.Scanner;

public class Ex20 { //해결
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("500원 개수: ");
	int a = sc.nextInt();
	
	System.out.print("100원 개수: ");
	int b = sc.nextInt();
	
	System.out.print("50원 개수: ");
	int c = sc.nextInt();
	
	System.out.print("10원 개수: ");
	int d = sc.nextInt();
			
	int sum = (500* a) + (100* b) + (50* c) + (10* d);
	System.out.println("동전의 총합은 " + sum + " 원 입니다.");
	
	sc.close();
	}
}
