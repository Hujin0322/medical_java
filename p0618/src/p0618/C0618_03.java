package p0618;

import java.util.Scanner;

public class C0618_03 {

	public static void main(String[] args) {
		
		//입력한 숫자 출력, x,X 입력 시 종료되도록 구현
		Scanner scan = new Scanner (System.in);
		// 프로그램 종료 시 입력한 숫자의 합 출력
		int sum = 0;
		while (true) {
			System.err.println("숫자를 입력하세요.(종료:x) >> ");
			String input = scan.nextLine();
			if (input.equalsIgnoreCase("x")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
			sum += Integer.parseInt(input);
			System.out.println("입력한 숫자: "+input+"합: "+sum);
		}
		}

		//		int i = 10;
//		while (i< 10) {
//			System.out.println(i);
//			i++;
//		}
		
//		// 초기화;조건식;증감식
//		for (int i=0;i<10;i++) {
//			System.out.println(i);
//		}
	}
}	