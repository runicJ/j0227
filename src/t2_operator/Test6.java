package t2_operator;

import java.util.Scanner;  //java.util 패키지에서 가져옴 //외부객체 //일단 객체=class로 알고있기

// 점수가 60점 이상은 '합격', 60점 미만은 '불합격'이라고 출력하시오.(String 변수에 담아서 출력하시오)
public class Test6 {
	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);  //입력받을때  //클래스 타입 = 객체 타입
		
		String res;
		int su;
		
		System.out.print("점수를 입력하세요? ");
		su = sc.nextInt();  // 리턴타입 int 입력 받고자 하는 값과 같은
		
		res = (su >= 60) ? "합격" : "불합격";
		System.out.println("점수 "+su+"는 "+res+"입니다.");
		
		sc.close();
	}
}