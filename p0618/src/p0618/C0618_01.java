package p0618;

import java.util.Scanner;

public class C0618_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 주민번호 앞자리를 입력받아 봄, 여름, 가을, 겨울인지 출력
		// 990101-1011101
		
		// 나이 출력 프로그램
		System.out.println("주민번호 전체를 입력하세요. >> ");
		//  1,2-1900/ 3,4-2000 (2024기준)
		String input = scan.nextLine();
		System.out.println("입력: "+input);
		// switch문 이용
		String year1 = input.substring(7,8);
		String year2 = input.substring(0,2); 
		switch (year1) {
		case "1", "2":
			int year_19 = Integer.parseInt("19"+year2);
			System.out.println(2024 - year_19);
			break;
		case "3", "4":
			int year_20 = Integer.parseInt("20"+year2);
			System.out.println(2024 - year_20);
			break;
		}
		

		// 12-02:겨울, 03-05: 봄, 06-08:여름, 09-11: 가을입니다로 출력
//		String birthM = input.substring(2,4);
//		switch (birthM) {
//		case "12", "01", "02": System.out.println("겨울입니다.");
//			break;
//		case "03", "04", "05": System.out.println("봄입니다.");
//			break;	
//		case "06", "07", "08": System.out.println("여름입니다.");
//			break;	
//		case "09", "10", "11": System.out.println("가을입니다.");
//			break;
//		}
		
		
//		String str = "990101";
//		String birthM = str.substring(2,4); //일부 글자 선택
//		System.out.println(birthM);
		

	}

}
