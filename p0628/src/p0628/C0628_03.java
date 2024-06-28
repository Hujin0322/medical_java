package p0628;

import java.util.Scanner;

public class C0628_03 {

	public static void main(String[] args) {
		//문자열 입력 받아, 2번째 문자 출력
		//문자열이 3칸 미만으로 입력이 되면, 다시 입력 할 수 있도록 무한 반복.
		// X 입력 시 프로그램 종료
		Scanner sc = new Scanner (System.in);
		
		while (true) {
			System.out.println("문자를 입력하세요. >> (X.종료)");
			String text = sc.nextLine();
			if (text.equalsIgnoreCase("x")) {
				System.out.println("프로그램을 종료합니다.");
				break;}
	
			if (text.length()<3) {
				System.out.println("3칸 이상으로 다시 입력하세요. >> ");
				continue;}
			else {
				System.out.println(" [ 2번째 문자 ] ");
				System.out.println(text.charAt(1));}
			}
			
		}
	}
