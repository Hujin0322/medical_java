package p0618;

import java.util.Arrays;
import java.util.Scanner;

public class C0618_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		// 1. 45개의 ball 배열 생성, 1-45까지 숫자 입력
		int[] ball = new int [45];
		
		// 2. 반복문 사용, 1-45까지 숫자 입력 
		for (int i=0;i<ball.length;i++) {
			ball[i] = i+1;
		}
		
		// 3. 랜덤으로 섞기
		int no = 0; //랜덤 번호
		int t_value = 0; //값 저장
		
		for  (int i=0;i<300;i++) {
			no = (int) (Math.random()*45); //0-44
			t_value = ball[0];
			ball[0] = ball[no];
			ball[no] = t_value;
		}System.out.println();
		
		// 4. my 로또번호 입력
		int[] myArr = new int[6];
		for(int i=0;i<myArr.length;i++) {
			System.out.printf("%d번째 숫자를 입력하세요.(1-45까지 숫자)>> ",i+1);
			myArr[i] = scan.nextInt();
		}
		
		System.out.print("입력한 숫자 : ");
		for(int i=0;i<myArr.length;i++) {
			System.out.print(myArr[i]+" ");
		}
		System.out.println();
		
			
			// 5. 로또 번호 출력
			System.out.print("로또 번호: ");
			for (int i=0;i<6;i++) {
				System.out.print(ball[i]+" ");
			}
			System.out.println();
		
		// 10개 배열 생성, 숫자 입력 받기, 3,4번째 숫자만 출력
//		int[] arr = new int [10];
//		for (int i=0;i<arr.length;i++) {
//			System.out.println(i+"번째 숫자를 입력하세요. >> ");
//			arr[i] = scan.nextInt();
//		}
//		
//		System.out.printf("%d, %d",arr[2],arr[3]);
		
	}

}
