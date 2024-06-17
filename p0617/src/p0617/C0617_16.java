package p0617;

import java.util.Scanner;

public class C0617_16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 구구단 2-9단 중 홀수단 출력
		for (int i=3;i<=9;i+=2) {
			System.out.printf("\n[ %d단 ]\n",i);
			for (int j=1;j<=9;j++) {
				System.out.printf("%d * %d = %d\t",i,j,i*j);
			} 
		} 
		
		
		//1-10까지의 합 출력
//		int sum = 0;
//		int i = 0;
//		for (i=1;i<=10;i++) {
//			sum = sum + i;
//		} 
//		
//		System.out.println((i-1)+"까지의 합: "+sum);
		
		
//		// 1-100까지 합 구하기, sum>150 때의 i값 출력
//		int sum = 0;
//		for (int i=1;;i++) {
//			sum = sum + i;
//			if (sum > 150) {
//				System.out.println("합: "+sum+"\ni: "+i);
//				break;
//			}
//		}
			
		
//		 구구단 출력 (중첩 for)
//		for (int i=2;i<=9;i++) {
//			System.out.printf("[ %d 단 ]\n",i);
//			for (int j=1;j<=9;j++) {
////				System.out.println(i+"*"+j+"="+i*j);
//				System.out.printf("%d * %d = %d \t",i,j,i*j);
//			}
//			System.out.println();
//		}
		
		
		// 10번 입력 받을때 마다 합계 출력 하시오.
		// 5->5, 10 -> 15, 10번 출력
//		int sum = 0;
//		for (int i=1;i<=10;i++) {
//			System.out.println("숫자를 입력하시오.");
//			int input = scan.nextInt();
//			sum = sum + input;
//			System.out.println(sum);
//		}	
		
		
		// 1-100까지 홀수만 더해서 최종값 출력
//		int sum = 0;
//		for (int i=1;i<=100;i+=2) sum = sum+i;
//		System.out.println(sum);
		
//		int sum = 0;
//		for (int i=1;i<=100;i++) {
//			if (i%2==1)	sum = sum + i;
//		}
//		System.out.println(sum);
		
		
		// for (초기화;조건식;증감식){ }
//		int sum = 0;
//		for (int i=1;i<=10;i++) {
//			sum = sum + i;
//			System.out.println("i: "+i);
//			System.out.println("sum: "+sum);
//		}
//		System.out.println("최종 sum: "+sum);
		
	} // main

} // class
