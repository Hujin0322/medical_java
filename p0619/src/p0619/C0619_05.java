package p0619;

public class C0619_05 {

	public static void main(String[] args) {
		//[5,5] 배열 생성 후 1-25 숫자 입력, 랜덤으로 섞을 후, 출력
//		!다시!
		int [][] arr = new int [5][5];
		int no=0;
		int no2=0;
		no = (int) (Math.random()*5); 
		no2 = (int) (Math.random()*5); 
		for (int i =0;i<5;i++) {
			for (int j =0;j<5;j++) {
				arr[no][no2] = arr[i][j];}
		}//for
		
		for (int i =0;i<5;i++) {
			for (int j =0;j<5;j++) {
				System.out.println(arr[i][j]);}
			System.out.println();
		}//for
		
	}//main

}//class
