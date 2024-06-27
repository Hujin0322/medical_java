package p0625;

public class Point3D extends Point { //자손
	// int x; 자동 선언됨.
	// int y; 자동 선언됨.
	// int r; 자동 선언됨.
	int z;
	
	Point3D(){} //기본생성자 만들고 시작~!
	
	Point3D(int x, int y, int z){
		//조상에 기본생성자 만들지 않으면
		//super() 조상생성자 에러 발생
		//super(x,y); 매개변수 조상생성자 직접 입력해야 함.
		
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	
}
