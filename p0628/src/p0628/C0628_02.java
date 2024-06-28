package p0628;

import java.util.Arrays;

public class C0628_02 {

	public static void main(String[] args) {
		String str = "Hello, World!";
		
		//charAt(): 지정한 위치에 있는 문자 1개 가져옴.
		char ch = str.charAt(0); 
		System.out.println(ch);
		
		//concat(): 문자열 합치기
		String s = "안녕하세요";
		String s2 = "홍길동입니다.";
		System.out.println(s+s2);
		System.out.println(s.concat(s2));
		
		//contains(): 문자열에 문자 포함 여부 확인
		System.out.println(s.contains("하")); 
		
		//equalsIgnoreCase() : 대소문자 구분없이 비교
		
		//endsWith: 지정된 문자열로 끝나는지 확인.
		String e = "abc.txt";
		System.out.println(e.endsWith("txt"));
	
		//length: 문자열 길이 확인
		String l = "안녕하세요. 반갑습니다.";
		System.out.println(l.length());
		
		//replace - 문자열 중 해당 문자열을 다른 문자열로 대체
		String r = "화면을 중지합니다. 중지를 위해 중지 버튼을 클릭하세요.";
		String r2 = r.replace("중지","stop");
		System.out.println(r2);
	
		//indexOf(): 해당 문자열이 있으면 위치값을 리턴, 없으면 -1 리턴
		String i = "abcdefghijklmn";
		System.out.println(i.indexOf("f"));
		
		//subString(): 문자 자르기
		String sub = "abc aaa aac bbc bbb ccc";
		System.out.println(sub.substring(8,15));		
		System.out.println(sub.substring(8));		
		
		//split(): 문자열 분리
		String sp = "국어, 영어, 수학, 합계";
		String [] spArr = sp.split(",");
		System.out.println(Arrays.toString(spArr));
		String sp2 = "국어/영어/수학/합계";
		String [] spArr2 = sp.split("/");
		System.out.println(Arrays.toString(spArr2));
		
		//trim(): 문자열 공백 제거 (맨 앞과 맨 뒤의 공백만 제거 가능.)
		String tr = "       안녕하세요. 반갑습니다.        ";
		System.out.println(tr.trim());
		
		System.out.println(tr.replace(" ", "")); //문자열 간 공백 제거까지 가능.
		
		int num = 0;
		String st1 = ""+num; //문자열로 치환됨 (권장)
		String st2 = String.valueOf(num); //문자열로 치환됨.
		
		
	}

}
