package p0620;

import java.util.Scanner;

public class C0620_04 {

	public static void main(String[] args) {
		// 변수선언
		Scanner scan = new Scanner (System.in);
		
		String tvcolor = "white";
		boolean power = false;
		int channel = 0;
		
		String tvcolor2 = "white";
		boolean power2 = false;
		int channel2 = 0;
		
		String tvcolor3 = "white";
		boolean power3 = false;
		int channel3 = 0;;
		
		// 타입 변수명 = 0 
		int a = 0;
		//객체 선언 사용
		//클래스타입 참조변수명 = new 클래스타입()
		Tv tv1; 		// 객체를 다루기 위한 참조변수 선언
		tv1 = new Tv(); //객체 생성 후, 생성된 객체의 주소를  참조변수에 저장.
 		
		
		Tv tv2 = new Tv();
		
		
		int[] num; 		  // 배열을 다루기 위한 참조변수 선언
		num = new int[5]; //배열 생성 후, 생성된 배열의 주소를 참조변수에 저장시킴.
		
	
		
//		String color = "white";
//		boolean power = false;
//		int channel = 0;
//		// volume, size, inch .....
//		
//		while (true) {
//			System.out.println("1. Tv 켜기");
//			System.out.println("1. Tv 끄기");
//			System.out.println("------------------");
//			System.out.println("TV 상태를 선택하세요. >> ");
//			int choice = scan.nextInt();	
//		}
		
	}

}
