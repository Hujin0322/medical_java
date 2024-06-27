package p0627;

abstract public class Unit {
	
	int hitPoint; 	  //현재 체력
	final int MAX_HP; //최대 체력
	
	Unit(int hp){
		MAX_HP = hp;
		
	}
	
	int x, y;
//	abstract void move(int x, int y); //메소드 구현 {}: 중괄호만 있으면 구현되는 정상 메소드								
									  //중괄호 없으면 absrtract 붙여줘야 함
	void stop() {
		
	}
}
