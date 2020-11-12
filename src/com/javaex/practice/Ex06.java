package com.javaex.practice;

public class Ex06 {	//해결
	public static void main(String[] args) {
		
		int i = 10;
		int n = i++ %2; //11 % 2 ->1  결론: 예상과 다르다.
		
		System.out.println(i); //i에 10+1이 적용이 되었고,
		System.out.println(n); // 10%2가 되고 나서 i이 값이 바뀌므로..0이다.
		
		System.out.println(i); //확인해보면 결국 7번줄 때문에 11로 바뀌었잖아.
	} 

}
