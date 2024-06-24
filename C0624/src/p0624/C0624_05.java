package p0624;

import java.util.Scanner;

public class C0624_05 {

	public static void main(String[] args) {
		// 두 수와 사칙연산 입력받고 (+,-,*,/) 결과값 출력 
		Scanner scan = new Scanner (System.in);
		int [] arr = new int[2];
		
		for (int i=0;i<arr.length;i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("사칙연산 입력");
		String str = scan.next();
		
//		System.out.println("숫자 입력");
//		int x = scan.nextInt();
//		
//		System.out.println("숫자 입력");
//		int x2 = scan.nextInt();
		
		
//		switch (str) {
//		case "+": System.out.println(x+x2); break;
//		case "-": System.out.println(x-x2); break;
//		case "*": System.out.println(x*x2); break;
//		case "/": System.out.println(x/x2); break;
//		}
		
		//인스턴스 메소드 = 객체 선언 후, 참조변수명.메소드명
//		Calculate c = new Calculate();
//		int result = c.cal(arr, str);
		
		
		
		
	}

}
