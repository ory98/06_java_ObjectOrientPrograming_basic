package step6_02.method;

// # this : 객체(오프젝트,인스턴스) 자신 

class Zealot { // 클래스 안은 변수랑 메서드만 가능 
	
	int shield = 60;
	int hp = 100;
	
	void showStatus() {
		System.out.println("this : " + this);
		System.out.println("shield : " + this.shield);
		System.out.println("hp : " + this.hp);
		System.out.println();

		// this는 생략이 가능하고 기본적으로 생략되어 있다. 
//		System.out.println("shield : " + this.shield);
//		System.out.println("hp : " + this.hp);
//		System.out.println();
	}
	
}

public class MethodEx04 {

	public static void main(String[] args) {
		
		Zealot z1 = new Zealot();
		System.out.println(z1);
		z1.shield = 0;
		z1.showStatus();
		
		Zealot z2 = new Zealot();
		System.out.println(z2);
		z2.shield = 0;
		z2.hp = 0;
		z2.showStatus();
		
		Zealot z3 = new Zealot();
		System.out.println(z3);
		z3.showStatus();
		

	}

}
