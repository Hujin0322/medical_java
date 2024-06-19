package p0619;

import java.util.Arrays;
import java.util.Scanner;

public class C0619_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		//1-25까지의 번호를 넣고, 랜덤으로 섞은 후, 출력
//		int[][] arr = new int[5][5];
//		for(int i=0;i<5;i++) {
//			for (int j=0;j<5;j++) {
//				arr[i][j] = 5*i+(j+1);
//			}
//		}
//		
//		// 2차원 배열 섞기
//		int no = 0;
//		int no2 = 0;
//		int t_value = 0;
//		
//		for (int i=0;i<300;i++) {
//			no = (int) (Math.random()*5);
//			no2 = (int) (Math.random()*5);
//			t_value = arr[0][0];
//			arr[0][0] = arr[no][no2]; // 랜덤값을 0번째 배열에 입력
//			arr[no][no2] = t_value;
//		}
		
//		int [] num = new int [25];
//		for (int i=0;i<num.length;i++) {
//			num[i] = i+1;
//		}System.out.println(Arrays.toString(num));
//		
//		int no=0;
//		int t_value = 0;
//		for (int i=0;i<300;i++) {
//			no = (int) (Math.random()*25);
//			t_value = num[0];
//			num[0] = num[no];
//			num[no] = t_value;
//		}
//		
//		int[][] arr = new int [5][5];
//		//[5,5] 형태로 출력
//		for (int i=0;i<arr.length;i++) {
//			for (int j=0;j<arr[i].length;j++) {
//				arr[i][j] = num[i*5+j];}
//		}
//	
//		for (int i=0;i<arr.length;i++) {
//			for (int j=0;j<arr[i].length;j++) { 
//				System.out.print(arr[i][j]+"\t");
//			}System.out.println();
//		}
		
		
		// 배열 생성
		int [] arr = new int [45];
		for (int i=0;i<arr.length;i++) {
			arr[i] = i+1;
		}
		
		// 배열 섞기
		int no = 0;
		int t_value = 0;
		for (int i=0;i<100;i++) {
			no = (int) (Math.random()*45);
			t_value = arr[0];
			arr[0] = arr[no];
			arr[no] = t_value;
		}
			
		//my_ball 입력
		//6개의 로또 번호 입력
		int[] my_ball = new int [6];
		for (int i=0;i<6;i++) {
			System.out.printf("%d번째 로또 번호를 입력하세요. >> ",i+1);
			my_ball[i] = scan.nextInt();
			
		}
		
		// my_ball 출력
		System.out.print("입력 번호: ");
		for (int i=0;i<6;i++) {
			System.out.printf("%4d",my_ball[i]);
		}
		System.out.println();
		
		//랜덤 번호 생성 및 출력
		System.out.print("로또 번호: ");
		int[] ball = new int [6];
		for (int i=0;i<ball.length;i++) {
			ball[i] = (int) (Math.random()*45);
			System.out.printf("%4d",ball[i]);
		}System.out.println();
		
		// 당첨 개수
		int [] lotto = new int[6];
		int count = 0;
		for (int i=0;i<6;i++) {
			for (int j=0;j<6;j++) {
				if (my_ball[i]==ball[j]) {
					lotto[count] = ball[i];
					count++;
					break;} //if
			}//for
		}//for 
		
		// 당첨번호 출력
		System.out.printf("당첨 개수: %d \n",count);
		System.out.print("당첨 번호: ");
		for (int i=0;i<count;i++) {
			System.out.printf("%4d",lotto[i]);
		}
		
		if (count==0) {
			System.out.println();
		}
		
		System.out.println();
		
		
		
		
	} //main

} //class
