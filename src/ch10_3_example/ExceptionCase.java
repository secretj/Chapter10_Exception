package ch10_3_example;


import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionCase {
	public static void main(String[] args) {
		//�������� ����ڷκ��� �Է¹ް� ������ �����ϰ�
		//�Է¹��� ���ڿ� ������  ����� ����Ͻÿ�
		//����ڰ� 0�� �Է¾��ϰ� ���ڸ� �Է������� ����ó��
		Scanner scn = new Scanner(System.in);
		

		
		System.out.printf("a/b...a?>");
		int x = scn.nextInt();
		
		try {
		
			System.out.printf("a/b...b?>");
			int y =scn.nextInt();
			System.out.printf("\n����� : %d/%d = %d\n",x,y,x/y );
			
		}catch(ArithmeticException e) {
			
			System.out.println("0���� ������ �����ϴ�.");
			
		}catch(InputMismatchException e) {
			System.out.println("���ڿ��� ���� �� �����ϴ�.");
		
		
			
		}
		finally {
			System.out.println("���� �� ");
		
		}
}
}




