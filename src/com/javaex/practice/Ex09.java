package com.javaex.practice;

public class Ex09 {

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

		
		
		double f = 80.0;
		double c = 32.0;
		System.out.println(5/9*(f-c)); ///  5/9*(80.0-32.0) // 5/9*(48.0) // 5/432
		
        //0.0115740740740741  // 0.1157407407407407 (.0을 넣으면 나오는 값)
		
	}
}
