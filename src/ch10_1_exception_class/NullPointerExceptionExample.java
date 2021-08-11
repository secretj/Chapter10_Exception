package ch10_1_exception_class;

class Person{}


public class NullPointerExceptionExample {

	public static void main(String[] args) {
		
		int x ;					//0
		double y;				//0.0
		boolean b;      		//false
		Person p;				//null 참조변수는 다 null
		
		
		String data1;
		String data2 =null;
		String data3 ="";
		String data4 =" ";
		
		try {
		System.out.println(data2.length());
		}catch(NullPointerException e){
			System.out.println("예외발생");
			System.out.println("\ne.toString():"+e.toString());
			System.out.println("e.getMessage() : "+e.getMessage());
			System.out.println("e.printStackTrace() : ");
			e.printStackTrace();		
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("예외발생 코드 실행!");
		}
		System.out.println("프로그램 종료");
		}
}


