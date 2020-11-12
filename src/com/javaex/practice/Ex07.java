package com.javaex.practice;

public class Ex07 { //해결
	public static void main(String[] args) {
		
		int i = 10;     // 
		int n = ++i %2; // 이미 i값이 ++로 인해 11이 되었다.
		
		System.out.println(i); 
		System.out.println(n); // 11%2 -> 1
		
		System.out.println(i);
		
	}
}
