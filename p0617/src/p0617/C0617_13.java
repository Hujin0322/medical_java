package p0617;

import java.util.Scanner;

public class C0617_13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		// if, switch
		// 두 수를 입력받아, 사칙연산 프로그램 구현
		System.out.println("숫자를 입력하세요. >> ");
		int n = scan.nextInt();
		System.out.println("숫자를 입력하세요. >> ");
		int n2 = scan.nextInt();
		
		System.out.println("1. (+)\t2. (-)\t3. (*)\t4. (/)");
		System.out.println("사칙연산 중 원하는 번호를 입력하세요. >> ");
		String choice = scan.next();
//		int choice = scan.nextInt();
		
		switch(choice) {
		// case는 break or 중괄호 만나야 멈춤.
		case "+":
			System.out.println("더하기: "+(n+n2));
			break;
		case "-":
			System.out.println("빼기: "+(n-n2));
			break;
		case "*":
			System.out.println("곱하기: "+(n*n2));
			break;
		case "/":
			System.out.println("나누기: "+(n/n2));
			break;
		default:
			System.out.println("번호를 잘못 입력했습니다.");
			break;
			
			
		}

	}

}
