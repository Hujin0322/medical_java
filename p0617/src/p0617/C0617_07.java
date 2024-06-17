package p0617;

import java.util.Scanner;

public class C0617_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 2개의 문자열을 입력받아 
		// 숫자면 정수타입으로 변경 후 두 수를 더하는 프로그램 구현
		System.out.println("1번 데이터를 입력하세요.");
		String str1 = scan.next();
		char ch1 = str1.charAt(0);
		
		System.out.println("2번 데이터를 입력하세요.");
		String str2 = scan.next();
		char ch2 = str2.charAt(0);
		
//		if ((ch1>='0' && ch1<='9') && (ch2>='0' && ch2<='9')) {
//			System.out.println((int)((ch1-'0')+(ch2-'0')));
//		}else {
//			System.out.println("숫자를 입력하세요.");
//		}
		
		if ((ch1>='0' && ch1<='9') && (ch2>='0' && ch2<='9')) {
			int num = ch1 - '0'; // 문자 숫자를 정수형으로 변경: '0' 빼줌.
//			int n = Integer.parseInt(str); // 문자열을 정수형으로 변경
			int num2 = ch2 - '0';
			System.out.println(num+num2);
		}else {
			System.out.printf("%c, %c \n", ch1,ch2); // %c: 문자 출력
		}
		
	}

}
