package t2_operator;

// 3항 연산자(변수 = 조건식 ? 참 : 거짓  // 변수에 참이나 거짓 값이 들어감. =은 할당 연산자)
public class Test3 {
	public static void main(String[] args) {
		// 점수가 90점 이상이면 'A', 90점 미만은 'B'로 처리 하시오.
		char res;
		int jumsu = 75;
		
		res = (jumsu >= 90) ? 'A' : 'B';
		System.out.println("점수 : "+jumsu+"은 "+res+"학점입니다.");
	}
}
