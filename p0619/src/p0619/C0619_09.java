package p0619;

import java.util.Scanner;

public class C0619_09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		final int STU = 10;
		String [] stuNo = new String [STU];
		String [] name = new String [STU];
		int [][] score = new int [STU][4];
		double [] avg = new double [STU];
		int [] rank = new int [STU];
		String [] title = {"학번","이름","국어","영어","수학","합계","평균","등수"};
		int s_count = 0;
		
		Loop1:while (true) {
			System.out.println(" [ 학생 성적 프로그램 ] ");
			System.out.println("-----------------------------------------");
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 출력");
			System.out.println("3. 성적 수정");
			System.out.println("0. 프로그램 종료");
			System.out.println("-----------------------------------------");
			System.out.println("원하는 번호를 입력하세요. >> ");
			int choice = scan.nextInt();
			scan.nextLine();
			
			switch (choice) {
			case 1:
				System.out.println("1. 성적 입력");
				while (true) {
					System.out.println("이름을 입력하세요.(0. 취소) >> ");
					String temp = scan.nextLine();
					if (temp.equals("0")) {
						System.out.println("성적 입력을 종료합니다.");
						break;}
					else {
						stuNo[s_count] = "S"+String.format("%04d", s_count+1); 
						for (int i=0;i<3;i++) {
						System.out.printf("%s 점수를 입력하세요. >> ",title[i+2]);
						score[s_count][i] = scan.nextInt();
						}
						
						//합계, 평균
						score[s_count][3] = score[s_count][0] + score[s_count][1] + score[s_count][2];
						avg[s_count] = score[s_count][3]/3.;
						
						System.out.println("성적 입력 완료");
						s_count++;
					}
				}//while
				
				break;
				
				
			case 2:
				System.out.println("2. 성적 출력");
				break;
				
				
			case 3:
				System.out.println("3. 성적 수정");
				break;
				
				
			case 0:
				System.out.println("0. 프로그램 종료");
				break Loop1;
				
				
			}//switch
			
			
			
			
		}//while

	}//main

}//class
