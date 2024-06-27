package p0627;

// 클래스를 상속받아 구현 extends 
// 인터페이스를 상속받아 구현 implements

public class extends Unit implements Fightable {

	@Override
	public void move(int x, int y) {
		
	}

	@Override
	abstract public void attack(Unit u);
	
	
}
