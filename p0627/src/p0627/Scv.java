package p0627;

public class Scv extends GroundUnit implements Repairable {

	Scv() {
		super(50);
		hitPoint = MAX_HP;	
	}
	
	void repair(GroundUnit u) {
		while(u.hitPoint != u.MAX_HP) {
			System.out.println("에너지 +5");
			u.hitPoint += 5;
		}
	}
	
	void repair(Unit u) {
		while(u.hitPoint != u.MAX_HP) {
			System.out.println("에너지 +5");
			u.hitPoint += 5;
		}
	}
	
	void repair(AirUnit u) {
		while(u.hitPoint != u.MAX_HP) {
			System.out.println("에너지 +5");
			u.hitPoint += 5;
		}
	}
	
	void repair(Repairable r) {
		Unit u = (Unit) r; //형변환
		while(u.hitPoint != u.MAX_HP) {
			System.out.println("에너지 +5");
			u.hitPoint += 5;
		}
	}
}
