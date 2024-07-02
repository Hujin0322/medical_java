package p0702;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class C0702_01 {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner (System.in);
		
		//기본 고정
		String stuNo="", name="";
		int kor=0,eng=0,math=0,total=0,rank=0;
		double avg=0;
		ArrayList<Students> list = new ArrayList<Students>();
		// 기본

		//throws Exception 이용
		FileReader fr = new FileReader("c:/save/abc.txt");
		BufferedReader br = new BufferedReader(fr);
		
		while(true) {
			String line = br.readLine();
			if(line == null) break;
			String[] arr = line.split(",");
			stuNo = arr[0];
			name = arr[1];
			kor = Integer.parseInt(arr[2]);
			eng = Integer.parseInt(arr[3]);
			math = Integer.parseInt(arr[4]);
			total = Integer.parseInt(arr[5]);
			avg = Double.parseDouble(arr[6]);
			rank = Integer.parseInt(arr[7]);
			list.add(new Students(stuNo,name,kor,eng,math,total,avg,rank));
		}//while
		
		//삭제의 경우에 문제 발생 이후 해결 예정
		Students.count = list.size()+1;
		
		while (true) {
		//학생입력부분 - (학번 자동 부여) 이름,국어,영어,수학
		System.out.println("이름을 입력하세요.(x.종료) >> ");
		name = scan.next();
		
		// x or X 입력 시, 입력프로그램 종료
		if (name.equalsIgnoreCase("x")) {
			System.out.println("입력화면 종료합니다.");
			break;
		}
		
		System.out.println("국어점수를 입력하세요. >> ");
		kor = scan.nextInt();
		System.out.println("영어점수를 입력하세요. >> ");
		eng = scan.nextInt();
		System.out.println("수학점수를 입력하세요. >> ");
		math = scan.nextInt();
//		Students s = new Students(); -> 기본생성자 찾아감.
		list.add(new Students(name,kor,eng,math)); //-> 4개짜리 생성자 찾아감.
		}
		
		//list에 2명 학생성적(김유신, 홍길동)을 추가해서 저장.
		//파일 저장
//		String str = "S0001,홍길동,100,100,100,300,100.0,0\r\n";

		String str = "";
		for (int i=0;i<list.size();i++) {
			Students s = list.get(i);
			str = s.getStuNo()+","+s.getName()+","+s.getKor()+","+s.getEng()+","+s.getMath()+","+s.getTotal()+","+s.getAvg()+","+s.getRank();
		}	
		
		FileWriter fw = new FileWriter("c:/save/abc.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(str);
		bw.close();
		System.out.println("파일에 내용을 저장했습니다.");
		
		
		//list 출력 (번호,이름,합계,평균,등수)
		for (int i=0;i<list.size();i++) {
			Students s = list.get(i);
			System.out.println(s.getStuNo()+"\t"+s.getName()+"\t"+s.getTotal()+"\t"+s.getAvg()+"\t"+s.getRank());
		}	

		// try-catch문 이용
//		List<Students> list = new ArrayList<Students>();
		
//		try {
//			FileReader fr = new FileReader("c:/save/abc.txt");
//			BufferedReader br = new BufferedReader(fr);
//			
//			while(true) {
//				String line = br.readLine();
//				if(line == null) break;
//				String[] arr = line.split(",");
//				stuNo = arr[0];
//				name = arr[1];
//				kor = Integer.parseInt(arr[2]);
//				eng = Integer.parseInt(arr[3]);
//				math = Integer.parseInt(arr[4]);
//				total = Integer.parseInt(arr[5]);
//				avg = Double.parseDouble(arr[6]);
//				rank = Integer.parseInt(arr[7]);
//				list.add(new Students(stuNo,name,kor,eng,math,total,avg,rank));
//			}//while
//			
//			//list 출력 (번호,이름,합계,평균,등수)
//			for (int i=0;i<list.size();i++) {
//				Students s = list.get(i);
//				System.out.println(s.getStuNo()+"\t"+s.getName()+"\t"+s.getTotal()+"\t"+s.getAvg()+"\t"+s.getRank());
//			}
//			
//			
//			
//		} catch (Exception e) {e.printStackTrace();}
		
		
	}

}
