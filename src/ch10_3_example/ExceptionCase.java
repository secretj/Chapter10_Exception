package ch10_3_example;


import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionCase {
	public static void main(String[] args) {
		//두정수를 사용자로부터 입력받고 나누기 실행하고
		//입력받은 숫자와 나누기  결과를 출력하시오
		//사용자가 0을 입력안하고 문자를 입력했을때 예외처리
		Scanner scn = new Scanner(System.in);
		
		try {
			System.out.printf("a/b...a?>");
			double x = scn.nextDouble();
		
			System.out.printf("a/b...b?>");
			double y =scn.nextDouble();
			System.out.printf("\n결과는 : %f/%f = %f\n",x,y,x/y );
			
			if(y==0) {
				throw new ArithmeticException();
			}
			
		}catch(ArithmeticException e) {
			
			System.out.println("0으로 나눌수 없습니다.");
			
		}catch(InputMismatchException e) {
			System.out.println("문자열은 들어올 수 없습니다.");
		
		
			
		}
		finally {
			System.out.println("과제 끝 ");
		
		}
}
}




