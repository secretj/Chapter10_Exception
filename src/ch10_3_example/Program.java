package ch10_3_example;

public class Program {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 1;
		
		System.out.println(a/b);
		System.out.println("���α׷� �����Ѵ�.");
		
		
		try {
			lib.write();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("�����");

	}
	

}


class lib{
	public static void write() throws InterruptedException  {
		Thread.sleep(1000);
	}
}
