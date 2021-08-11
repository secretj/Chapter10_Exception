package ch10_3_example;

public class ExceptionExample {
	public static void main(String[] args) {
	
		System.out.printf("���ϱ�: ");
		try {
			Calculator.add(1200, 0);
		} catch (Over1000Exception e) {
			System.out.println(e.toString());
		} catch (Down0Exception e) {
			System.out.println(e.getMessage());
		//������ �������� ��� �鸮�°� ���ܰ��� �ƴϴ��� �鸲 !! 
		}finally {  
			System.out.println("=================");
		}
		
		System.out.printf("����: ");
		try {
			Calculator.sub(5,8);
		} catch (Down0Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.printf("���ϱ�: ");
		Calculator.multi(1,3);
		
		System.out.printf("������: ");
		try {
			Calculator.div(1, 0);
		} catch (bunmo0 e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("��������");
	}
}


/*protected*/ class Calculator{

	//���������� x+y ���� 1000�� �Ѱų� ������ ������ ������ ��������.
	public static int add(int a, int b) throws Over1000Exception, Down0Exception {
		int result=a+b;
		if(result>1_0_00 ) {
			throw new Over1000Exception();	
		}
		if(result<0) {
			throw new Down0Exception();
		}
		System.out.println(result);
		return result;
	}
	
	public static int sub(int a, int b) throws Down0Exception {
		int result=a-b;
		if(result<0) {
			throw new Down0Exception();
			}
		System.out.println(result);
		return result;
	}
	public static int multi(int a, int b) {
		int result=a*b;
		
		System.out.println(result);
		return result;
	}
	
	//���������� b�� ���� 0�̸� ����
	public static int div(int a, int b) throws bunmo0 {
		if(b==0) {
			throw new bunmo0();
		}
		int result=a/b;
		System.out.println(result);
		return result;
	}
}



