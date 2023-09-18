package step8_01.technique;

class Car {
	
	int cost = 1000;  // 비용
	int life = 5;  // 수명
	int rank = 10;   // 랭킹
	String color = "White";  // 색깔
	
	void valueChange() {
		cost -= 50;
		life--;
		rank += 5;
	}
	
	void changeColor(String color) {
		this.color = color;
	}
	
	void showStatus() {
		System.out.println("cost : " + this.cost);
		System.out.println("life : " + this.life);
		System.out.println("rank : " + this.rank);
		System.out.println("color : " + this.color);
		System.out.println();
	}
}

// 그대로 상속받기
class Tico extends Car {}  // Car 클래스를 상속 받음.
class BMW extends Car {}  // Car 클래스를 상속 받음.

// 상속 받고, 매서드 재정의, 추가하기
class ValuableTico extends Car {  // 골동품으로 가치 있는 티코라서 메서드를 재정의
	
	void valueChange() {  // 메서드 재정의 (메서드 오버라이딩)
		cost += 100;
		life--;
		rank -= 3;
	}
	
	void additionalInfo() {
		System.out.println("It's a valuable tico!");
	}
}


public class InheritancePractice {

	public static void main(String[] args) {
		
		Tico tico = new Tico();
		tico.showStatus();
		tico.valueChange();
		tico.valueChange();
		tico.showStatus();
		
		System.out.println("\n=================\n");
		
		BMW bmw = new BMW();
		bmw.showStatus();
		bmw.valueChange();
		bmw.changeColor("Blue");
		bmw.showStatus();
		
		System.out.println("\n=================\n");
		
		ValuableTico valuableTico = new ValuableTico();
		valuableTico.showStatus();
		valuableTico.valueChange();
		valuableTico.changeColor("Yellow");
		valuableTico.showStatus();
	}

}
