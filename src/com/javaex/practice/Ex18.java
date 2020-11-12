package com.javaex.practice;

import java.util.Scanner;

public class Ex18 { //해결
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("화씨:");
		double temp = sc.nextDouble();
		
		double sum = (double)5/9*(temp-32);
		
		System.out.println("화씨 " + temp+ " 의 " + "섭씨온도는 "+ sum + " 입니다.");
		
		
		sc.close();
	}
	

}
