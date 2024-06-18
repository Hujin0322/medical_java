package p0618;

import java.util.Arrays;
import java.util.Scanner;

public class C0618_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		// 5개의 숫자를 모두 입력받은 후, 모두 출력
//		int score[] = new int[5];
		int [] score = new int[5]; // 배열 생성
//		score[0] = 1;
//		score[1] = 2;
//		score[2] = 3;
//		score[3] = 4;
//		score[4] = 5;
		
		// 배열에 입력
		for (int i=0;i<5;i++){
			score[i] = i+1;
		}
		
//		for (int i=0;i<5;i++) {
//			System.out.println("숫자 입력. >> ");
//			score[i] = scan.nextInt();
//		}
		
		System.out.println(score); //score 주소값
		System.out.println(Arrays.toString(score)); //배열의 모든 데이터 확인 메소드
		
		// 배열에 출력
		for (int i=0;i<5;i++){
			System.out.println(score[i]);
		}
		
//		System.out.println("숫자 입력. >>");
//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		int c = scan.nextInt();
//		int d = scan.nextInt();
//		int e = scan.nextInt();
//		System.out.printf(" %d, %d ,%d ,%d ,%d",a,b,c,d,e);

	}

}
