package p0614;

public class C0614_07 {

	public static void main(String[] args) {
		
		// printf의 출력: 소수점 제한, 8진수, 16진수 출력 가능
		System.out.println(10.0/3); //println: 자동 줄단락 바꿈
		System.out.printf("%.2f \n", 10.0/3); //printf: 자동 줄단락 바꿈X
		
		int x = 0x1a; //16진수 표현법 1a = 16
		System.out.println("x : "+x);
		System.out.printf("%X",x); //printf: 16진수 출력 가능
		
		long a = 10L;
		System.out.printf("%d \n", a);
		int b = 20;
		System.out.printf("%d \n",b);
		
		int age = 10;
		int year = 2014;
		System.out.printf("나이: %d세, 년도: %d년 \n",age, year);
		System.out.println("나이: "+age+"세, 년도: "+year+"년");
		
		System.out.printf("[%5d]\n",10);
		System.out.printf("[%05d]\n",10);
		
		
		
	}

}
