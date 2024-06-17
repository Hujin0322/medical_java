package p0617;

import java.util.Scanner;

public class C0617_15 {

	public static void main(String[] args) {
		// 1부터 10까지의 랜덤 숫자 생성
		// 숫자 1개를 입력받아 정답인지 아닌지 출력
		// 동일=당첨 / 꽝 출력
		Scanner scan = new Scanner(System.in);
		int num = (int)(Math.random()*10)+1;
		
		System.out.println("숫자를 입력하세요. >> ");
		int input = scan.nextInt();
		
		if (num == input) {
			System.out.println("당첨");
		}else {
			System.out.println("꽝, 정답: "+num);
		}
		

//		// 1부터 100까지의 숫자를 랜덤으로 생성해서 출력
//		int num = (int)(Math.random()*100)+1;
//		System.out.println(num);
//		
//		// 1부터 3까지 랜덤 숫자 생성
//		int num2 = (int)(Math.random()*3)+1;
//		System.out.println(num2);
//		
//		// 1-45
//		System.out.println((int)(Math.random()*45)+1);
		
		
//		Math.random(); // 0 <= x && x < 1
//		System.out.println(Math.random()); // double type
//		
//		Math.round(0); // int
//		
//		Math.ceil(0); // double 
//		
//		Math.max(10.5, 5); // int
//		
//		// 1-10까지 랜덤숫자 출력
//		int num = (int)(Math.random()*10)+1;
//		System.out.println(num);
//		
//		// 1-100까지 생성
//		int num1 = (int)(Math.random()*100)+1;
//		System.out.println(num1);
//		
//		// 0-4까지
//		int num2 = (int)(Math.random()*5);
//		System.out.println(num2);
//		
//		// 0-19까지
//		int num3 = (int)(Math.random()*20);
//		System.out.println(num3);
//		
//		// 2 - 10까지
//		int num4 = (int)(Math.random()*9)+2;
		
		
		

	}

}
