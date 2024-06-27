package p0627;

public class Tank extends GroundUnit implements Repairable {

	Tank() {
		super(150); //최대치
		hitPoint = MAX_HP;
		
	}

}
