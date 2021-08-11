package ch10_3_example;


public class Over1000Exception extends Exception {
	@Override
	public String toString() {
		return "결과는 천이 넘는다";
		
	}
	@Override
	public String getMessage() {
		return "결과는 천이 넘는다";
	}
	
	
}
