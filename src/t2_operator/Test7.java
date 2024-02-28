package t2_operator;

import java.util.Scanner;

public class Test7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  //sc - 클래스 변수(객체 변수)
		
	  char res;
	  int jumsu;
	  
	  System.out.print("점수를 입력하세요? ");
	  jumsu = sc.nextInt();
	  
	  res = (jumsu >= 90) ? 'A' : (jumsu >= 80) ? 'B' : (jumsu >= 70) ? 'C' : (jumsu >= 60) ? 'D' : 'F';
	  System.out.println("점수 "+jumsu+"는 "+res+" 학점입니다.");
	  
	  sc.close();
	}
}
