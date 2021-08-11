package ch10_3_example;

public class Program {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 1;
		
		System.out.println(a/b);
		System.out.println("프로그램 종료한다.");
		
		
		try {
			lib.write();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("고더기");

	}
	

}


class lib{
	public static void write() throws InterruptedException  {
		Thread.sleep(1000);
	}
}
