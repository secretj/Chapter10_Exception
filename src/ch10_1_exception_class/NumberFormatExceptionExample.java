package ch10_1_exception_class;

public class NumberFormatExceptionExample {
	public static void main(String[] args) {
		String data1 ="100";
		String data2 ="a3100";
		String data3 = data2.substring(1);
		
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data3);
		
		int result = value1 + value2;
		
		System.out.println(data1+"+"+data3+"="+result);
	}

}
