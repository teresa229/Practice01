package com.javaex.practice;

public class Ex03 {
	public static void main(String[] args) {
		
		int x = 1;
		int y = 1;
		
		int a = ++x *2; //2*2=4
		int b = y++ *2; //1*2=2
		
		System.out.println("a=" + a); //
		System.out.println("b=" + b); //
		System.out.println("x=" + x); // x값이 ++로 변했다.
		System.out.println("y=" + y); // y값도 계산 후 ++로 변했다.
		
	}

}
