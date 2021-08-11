package ch10_3_example;

public class ExceptionExample {
	public static void main(String[] args) {
	
		System.out.printf("더하기: ");
		try {
			Calculator.add(1200, 0);
		} catch (Over1000Exception e) {
			System.out.println(e.toString());
		} catch (Down0Exception e) {
			System.out.println(e.getMessage());
		//무조건 마지막에 모두 들리는곳 예외값이 아니더라도 들림 !! 
		}finally {  
			System.out.println("=================");
		}
		
		System.out.printf("빼기: ");
		try {
			Calculator.sub(5,8);
		} catch (Down0Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.printf("곱하기: ");
		Calculator.multi(1,3);
		
		System.out.printf("나누기: ");
		try {
			Calculator.div(1, 0);
		} catch (bunmo0 e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("정상종료");
	}
}


/*protected*/ class Calculator{

	//업무적으로 x+y 값은 1000을 넘거나 음수가 나오면 에러가 나오도록.
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
	
	//업무적으로 b의 값이 0이면 에러
	public static int div(int a, int b) throws bunmo0 {
		if(b==0) {
			throw new bunmo0();
		}
		int result=a/b;
		System.out.println(result);
		return result;
	}
}



