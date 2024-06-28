package p0628;

import java.util.Scanner;

public class C0628_04 {

	public static void main(String[] args) { //
		Scanner sc = new Scanner (System.in);
		System.out.println("찾고자 하는 문자열을 입력하세요. >> ");
		String search = sc.next();

		String str = "abcdeakabcdefga";
		System.out.println("해당 문자열: "+str);
		int count = 0;
		
		while (true) {
			int num = 0;
			num = str.indexOf(search);
			if(num == -1) {
				break; //해당하는 문자열을 못 찾았을 때 -1 리턴
			}else {
				count++;
				str = str.substring(num+2);
			}
		}
		System.out.printf("%s 찾는 문자열 개수: %d \n",search, count);
	}

}
