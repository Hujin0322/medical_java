package p0624;

import java.util.Scanner;

public class Calculate {
	static Scanner scan = new Scanner (System.in);
	
	// 메소드 1개를 사용해서 처리하는 방법
	// void = 리턴 값X
	void change (int [] score) {
		System.out.println("변경할 국어 점수를 입력하세요. >> ");
		score[0] = scan.nextInt();
		
		System.out.println("변경할 영어 점수를 입력하세요. >> ");
		score[1] = scan.nextInt();
		
		System.out.println("변경할 수학 점수를 입력하세요. >> ");
		score[2] = scan.nextInt();
	}
	
	//
//	int korchange(int kor) {
//		System.out.println("변경할 국어 점수를 입력하세요. >> ");
//		kor = scan.nextInt();
//		return kor;
//	}
//	
//	int engchange(int eng) {
//		System.out.println("변경할 영어 점수를 입력하세요. >> ");
//		eng = scan.nextInt();
//		return eng;
//	}
//	
//	int mathchange(int math) {
//		System.out.println("변경할 수학 점수를 입력하세요. >> ");
//		math = scan.nextInt();
//		return math;
//	}
	
	
	
	
	
	
	
	
	
	
	
//	int result=0;
//	
//	// cal()
//	// return result 사용;
//	int cal (int [] arr, String str) {
//		switch (str) {
//		case "+": 
//			result = arr[0]+arr[1];
//			break;
//		case "-": 
//			result = arr[0]-arr[1];
//			break;
//		case "*": 
//			result = arr[0]*arr[1];
//			break;
//		case "/": 
//			result = arr[0]/arr[1];
//			break;
//		}
//		System.out.println(result);
//		return result;
		
//	}
	
	
	
}
