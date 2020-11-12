package com.javaex.practice;

import java.util.Scanner;

public class Ex09 { //해결 안됨

	public static void main(String[] args) {
		
	//	double f=80.0;
	//	System.out.println(5/0*(f-32.0));
		
		/*
		  화씨 온도를 섭씨 온도로 변환하는 프로그램이다.  
                    결과값이 0이 나오는 이유는 무엇이며 정상인 결과가 나오도록 수정하세요.

         [참고]    ℃ : 섭씨 기호   ℉ : 화씨 기호
		  화씨->섭씨 ℃ = 5/9 * (℉ - 32)
		  섭씨->화씨 ℉ = (℃ * 9/5) + 32
		*/

		Scanner sc = new Scanner(System.in);
		
		double temp = sc.nextDouble();
		
	//	double temp = 80.0;
		double c = 32.0;
		double sum = (double)5/9*(temp-c);
		System.out.println(sum); // 5/9 앞에 double을 붙여주어야 한다.
		
		sc.close();
	}
}
