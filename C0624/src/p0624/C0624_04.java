package p0624;

import java.util.Scanner;

public class C0624_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int [] num = new int[3];
		for (int i=0;i<3;i++) {
			System.out.println("숫자 입력");
			num[i] = scan.nextInt();
		}
		
		//객체 선언 후, 참조변수명.메소드명
		Cal c = new Cal();
		int result = c.add(num[0],num[1],num[2]);
		
		int sum = c.add2(num);
		
		
		System.out.println(result);
		
		
		
		//두 수를 입력 받아, 두 수를 더한 값 출력
//		System.out.println("숫자 입력 2번");
//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		
//		System.out.println(a+b);
		
		// 세 개의 수 입력 받아 더한 값 출력 (배열 사용)
//		int sum = 0;
//		int[] a = new int [3];
//		for (int i=0;i<3;i++) {
//			System.out.println("숫자 입력");
//			a[i] = scan.nextInt();
//			sum += a[i];
//			System.out.println(sum);
//		}System.out.println(Arrays.toString(a));
//		
		
		
		
		
		
		
		
		
		
		
		
		}//main

}//class
