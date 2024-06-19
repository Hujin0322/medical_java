package p0618;

import java.util.Scanner;

public class 연습 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int[] ball = new int [45];
		
		for (int i=0;i<ball.length;i++) {
			ball[i] = i+1;
		}
		
		int no=0;
		int t_value = 0;
		
		for (int i=0;i<300;i++) {
			no = (int) (Math.random()*45);
			t_value = ball[0];
			ball[0] = ball[no];
			ball[no] = t_value;
		}System.out.println();
		
		int[] myArr = new int[6];
		for (int i=0;i<myArr.length;i++) {
			System.out.println("숫자를 입력하세요. >> ");
			myArr[i] = scan.nextInt();
		}
		System.out.print("입력한 숫자: ");
		for (int i=0;i<6;i++) {
			System.out.print(ball[i]+" ");
			
		}System.out.println();
		
		
		
	}//main

} //class
