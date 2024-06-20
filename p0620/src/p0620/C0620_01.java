package p0620;

import java.util.Arrays;
import java.util.Scanner;

public class C0620_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
//		int[] score = new int[45];
//		for (int i=0;i<score.length;i++) {
//			score[i] = i+1;
//		}System.out.println(Arrays.toString(score));
//		}
	
		//2차원 배열 생성
		String [][] arr = new String [5][5];
		for (int i=0;i<arr.length;i++) {
			for (int j=0;j<arr[i].length;j++) {
				arr[i][j] = i*5+(j+1)+"";
			}
		}
		
		//2차원 배열 랜덤 섞기
		int no = 0, no2 = 0;
		String t_value = "";
		
		for (int i=0;i<300;i++) {
			no = (int) (Math.random()*5);
			no2 = (int) (Math.random()*5);
			
			t_value = arr[0][0];
			arr[0][0] =	arr[no][no2];
			arr[no][no2] = t_value;
		}	
		
		int count = 0;
		
		while (true) {
			// 2차원 배열 출력
			System.out.println("[ 2차원 배열 출력 ]");
			System.out.println("-------------------------------------");
			for (int i=0;i<arr.length;i++) {
				for (int j=0;j<arr[i].length;j++) {
					System.out.print(arr[i][j]+"\t");
				}System.out.println();
			}
			
			System.out.println("-------------------------------------");
			if (count == 25) {
				System.out.println("모든 숫자 입력 완료됨");
				System.out.println("[ 프로그램 종료 ]");
				break;
			}
			
			System.out.println("1-25 내의 숫자를 입력하세요. >> ");
			int input = scan.nextInt();
			System.out.println("입력한 숫자: "+input);
			System.out.println();
			
			if (input<=0 || input>25) {
				System.out.println("1-25 내의 숫자를 입력하세요.");
				System.out.println();
				continue;
			}
			
			// 1-25까지의 숫자를 넣으면 X표시가 나타나도록 구현
			int temp = 0;

			String input_str = input+"";
			for (int i=0;i<arr.length;i++) {
				for (int j=0;j<arr[i].length;j++) {
					if (arr[i][j].equals(input_str)) {
						arr[i][j] = "X";
						temp= 1;
						count++;}
					}
				}
			
			//중복값 입력 시
			if (temp==0) {
					System.out.println("중복 값을 입력했습니다.");
					System.out.println();
					continue;}

		}//while
		 
	}//main

}//class
