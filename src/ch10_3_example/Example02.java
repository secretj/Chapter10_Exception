package ch10_3_example;

import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {
		//�������� ����ڷκ��� �Է¹ް� ������ �����ϰ�
				//�Է¹��� ���ڿ� ������  ����� ����Ͻÿ�
				//����ڰ� 0�� �Է¾��ϰ� ���ڸ� �Է������� ����ó��
		Scanner scn = new Scanner(System.in);
		System.out.printf("a���� : ");
		int a = scn.nextInt();
		System.out.printf("b���� : ");
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
