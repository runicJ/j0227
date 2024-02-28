package t1_variable;

public class Test10 {
	public static void main(String[] args) {
		double res;
		double r = 10;
		res = r * r * 3.14;
		System.out.println("1.res : " + res);
		
		res = (double) 10 / 3;  // 정수/정수 = 값:정수
		res = 10 / 3;  // res = 3.0 // 정수/정수 = 값:정수 res가 double이므로 실수로
		// res = 10 / 3.0;  // res = 3.3333333333333335
		System.out.println("2.res : " + res);
	}
}
