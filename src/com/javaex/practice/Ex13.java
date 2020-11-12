package com.javaex.practice;

import java.util.Scanner;

public class Ex13 { //해결

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("환전할 원화를 입력하세요:");
		int exchange = sc.nextInt();
		final double dollar = 1230.95;
		
		double result01 = (double)exchange/dollar;
		System.out.println( result01 );
		
//		System.out.println("받으실 달러는 " + result01);
		
		sc.close();
	}
}
