package ch10_3_example;

import java.util.Scanner;

public class ExceptionCase {
	public static void main(String[] args) {
		//�������� ����ڷκ��� �Է¹ް� ������ �����ϰ�
		//�Է¹��� ���ڿ� ������  ����� ����Ͻÿ�
		Scanner scn = new Scanner(System.in);
		
		System.out.printf("a/b...a?>");
		int x = scn.nextInt();
		System.out.printf("a/b...b?>");
		int y =scn.nextInt();
		int result = x/y;
		
		
		try {
		System.out.printf("\n %d / %d = %d",x,y,result);
		}catch(ArithmeticException e) {
			
				System.out.println("0���� ������ �����ϴ�.");
		}finally {
		
		System.out.println("���α׷�����");
		}
}
}


