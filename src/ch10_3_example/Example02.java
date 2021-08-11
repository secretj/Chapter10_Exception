package ch10_3_example;

import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {
		//두정수를 사용자로부터 입력받고 나누기 실행하고
				//입력받은 숫자와 나누기  결과를 출력하시오
				//사용자가 0을 입력안하고 문자를 입력했을때 예외처리
		Scanner scn = new Scanner(System.in);
		System.out.printf("a값은 : ");
		int a = scn.nextInt();
		System.out.printf("b값은 : ");
		int b = scn.nextInt();		
		
		
			try {
				abc.dive(a, b);
			} catch (bunmo0 e) {
				
				System.out.println(e.getMessage());
			}
		
		}
}

	



class abc{
	public static int dive(int a, int b) throws bunmo0 {
		if(b==0) {
			throw new bunmo0();
		}
		int result = a/b;
		System.out.println(result);
		return result;
		
	}
}
