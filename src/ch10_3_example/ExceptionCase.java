package ch10_3_example;


import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionCase {
	public static void main(String[] args) {
		//�������� ����ڷκ��� �Է¹ް� ������ �����ϰ�
		//�Է¹��� ���ڿ� ������  ����� ����Ͻÿ�
		//����ڰ� 0�� �Է¾��ϰ� ���ڸ� �Է������� ����ó��
		Scanner scn = new Scanner(System.in);
		
		try {
			System.out.printf("a/b...a?>");
			double x = scn.nextDouble();
		
			System.out.printf("a/b...b?>");
			double y =scn.nextDouble();
			System.out.printf("\n����� : %f/%f = %f\n",x,y,x/y );
			
			if(y==0) {
				throw new ArithmeticException();
			}
			
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




