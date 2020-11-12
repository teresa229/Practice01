package com.javaex.practice;

import java.util.Scanner;

public class Ex14 { //해결
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로를 입력하세요: ");
		double lateral = sc.nextDouble();
//		System.out.println();
		System.out.print("세로를 입력하세요: ");
		double column = sc.nextDouble();
		
		
		System.out.println("사각형의 넓이는 " + lateral*column);
		
		System.out.println("사각형 둘레는 " + (lateral*2 + column*2));
		
		sc.close();
	}
	
}
