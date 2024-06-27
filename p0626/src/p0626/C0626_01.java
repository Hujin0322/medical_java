package p0626;

import java.util.Scanner;

public class C0626_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		Buyer b = new Buyer("aaa","1111",10000000,0);
		
		while(true) {
		System.out.println("ID를 입력하세요. >> ");
		String id = scan.next();
		System.out.println("PW를 입력하세요. >> ");
		String pw = scan.next();
		
		if(b.userId.equals(id) && b.userPw.equals(pw)){
			System.out.println("일치");
			break;
		}else {
			System.out.println("불일치, 재입력");
		}
	}
		
		System.out.println("구매사이트 접속 진행.");
		
	}

}
