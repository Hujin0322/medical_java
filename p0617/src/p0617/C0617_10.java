package p0617;

import java.util.Scanner;

public class C0617_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		// 90점 이상 A, 80점 이상 B, 70점 이상 C, 60점 이상 D, 그 외 F
		System.out.println("숫자를 입력하세요.");
		int num = scan.nextInt();
		if (num>=90) System.out.println("A");
		else if (num>=80) System.out.println("B");
		else if (num>=70) System.out.println("C");
		else if (num>=60) System.out.println("D");
		else System.out.println("F");
		
		// 숫자를 입력받아, 60점이상이면 합격, 60점 미만이면 불합격 출력
//		System.out.println("숫자를 입력하세요.");
//		int num = scan.nextInt();	
//		String pf = num>=60? "합격":"불합격"; 
//		System.out.println(pf);
		
//		if (num>=60) {
//			System.out.println("합격");
//		}else {
//			System.out.println("불합격");
//		}
		
	}

}
