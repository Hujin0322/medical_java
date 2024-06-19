package p0619;

import java.util.Arrays;
import java.util.Scanner;

public class C0619_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		// 로또 프로그램 구현
		// 1-45개 배열에서 랜덤으로 섞어, 그 가운데 6개를 가져오면 로또 번호
		// 입력 번호 6개
		// 당첨번호 개수 배열, 카운트 변수
		// 모든 배열 출력
		
		//1. ball 배열 1-45 입력
		int [] ball = new int [45];
		for (int i=0;i<45;i++) {
			ball[i] = i+1;
		}//for
		
		//2. ball 배열 섞기
		int no = 0; 
		int t_value = 0; //임시 저장 공간
		
		for (int i=0;i<300;i++) {
			no = (int) (Math.random()*45);
			t_value = ball[0];
			ball[0] = ball[no];
			ball[no] = t_value;
		}System.out.println(Arrays.toString(ball));
		
		//3. 랜덤 번호 6개
		int [] ran = new int [6];
		for (int i=0;i<ran.length;i++) {
			ran[i] = (int) (Math.random()*45);
		}System.out.println("당첨 번호: "+Arrays.toString(ran));
		
		
//		// 2차원 배열 입력
//		int [][] arr = new int[5][5];
//		for (int i=0;i<arr.length;i++) {
//			for (int j=0;j<arr[i].length;j++) {
//				arr[i][j] = 5*i+(j+1);
//			}
//		}
//		
//		// 2차원 배열 출력
//		for (int i=0;i<arr.length;i++) {
//			for (int j=0;j<arr[i].length;j++) {
//				System.out.print(arr[i][j]+"\t");
//			}System.out.println();
//		}
		
		
	}//main

}// class
