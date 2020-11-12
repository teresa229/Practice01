package com.javaex.practice;

import java.util.Scanner;

public class Ex17 { //해결
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름: ");
		double radius = sc.nextDouble();
		
		double target = Math.pow(radius, 3); //radius의 3승
		double pi = 3.14;
		double v = (double)4/3 * pi * (double)target;
		
		System.out.println("구의 부피는: " + v + " 입니다.");
		
		sc.close();
	}

}
