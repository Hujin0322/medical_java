package p0617;

import java.util.Scanner;

public class C0617_09 {

	public static void main(String[] args) {
		// 문자열 선언 방법 2가지
		Scanner scan = new Scanner (System.in);
		String str = "안녕"; // 1번
		String str2 = "안녕2";
		String str3 = new String("안녕"); // 2번
		int num = 5;
		int num2 = 5; 
		// 기본 타입 8개 - bool, char, byte, short, int, long, float, double
		// 비교 연산자를 통해 확인 가능
		if (num==num2) {
			System.out.println("같은 숫자입니다.");
		}else {
			System.out.println("다른 숫자입니다.");
		}
		
		System.out.println("str: "+str);
		System.out.println("new str: "+str3);
		
		// 문자열, 참조변수 비교는 == 비교가 안됨. equals메소드 사용해야 함.
		if (str.equals(str3)) {
			System.out.println("같은 문자입니다.");
		}else {
			System.out.println("다른 문자입니다.");
		}
		//---------------------------------------
		if (str3 == "안녕") {
			System.out.println("같은 문자입니다.");
		}else {
			System.out.println("다른 문자입니다.");
		}
		
	}

}
