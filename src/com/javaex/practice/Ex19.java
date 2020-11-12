package com.javaex.practice;

import java.util.Scanner;

public class Ex19 { //해결

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long sun = sc.nextLong();
		
		System.out.println("빛이 1년 동안 가는 거리는  " + sun*3000000*31556926 + " km 입니다.");
	
		sc.close();
	}
	
}
