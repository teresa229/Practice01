package com.javaex.practice;

import java.util.Scanner;

public class Ex12 { //해결

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
        System.out.print("반지름을 입력하세요:");
		double circle = sc.nextDouble();
		double target = Math.pow(circle, 2);
		double r = 3.14;
		System.out.println("원의 넓이는 " + r*target);

	
		sc.close();
	}
}
