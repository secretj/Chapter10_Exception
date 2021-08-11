package ch10_3_example;

import java.util.Scanner;

public class ExceptionCase {
	public static void main(String[] args) {
		//두정수를 사용자로부터 입력받고 나누기 실행하고
		//입력받은 숫자와 나누기  결과를 출력하시오
		Scanner scn = new Scanner(System.in);
		
		System.out.printf("a/b...a?>");
		int x = scn.nextInt();
		System.out.printf("a/b...b?>");
		int y =scn.nextInt();
		int result = x/y;
		
		
		try {
		System.out.printf("\n %d / %d = %d",x,y,result);
		}catch(ArithmeticException e) {
			
				System.out.println("0으로 나눌수 없습니다.");
		}finally {
		
		System.out.println("프로그램종료");
		}
}
}


