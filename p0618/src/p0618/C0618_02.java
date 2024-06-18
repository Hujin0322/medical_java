package p0618;

import java.util.Scanner;

public class C0618_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요. >> ");
		String input = scan.nextLine();
		String year = input.substring(0,2);
		String flag = input.substring(7,8);
		if (flag.equals("1") || flag.equals("2")) {
			int age = Integer.parseInt("19"+year);
			System.out.println(2024-age);
		}else if (flag.equals("3") || flag.equals("4")){
			int age = Integer.parseInt("20"+year);
			System.out.println(2024-age);
		}

	}

}
