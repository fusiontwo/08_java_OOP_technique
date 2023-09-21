package step8_01.technique;

import java.util.ArrayList;
import java.util.HashMap;

/*

	# 다형성 ( polymorphism )
	
	- 다형성이란 하나의 메소드가 서로 다른 클래스에서 다양하게 실행되는 것을 의미한다.
	
	- 다형성을 구현하기 위해서는 다형성을 구현할 메소드가 포함된 모든 클래스가 같은 부모 클래스를 가져야 한다.
	
	- 부모 클래스와 자식 클래스에 같은 메소드가 있어야 하며 자식 클래스는 이 메소드를 반드시 override 하여 사용해야 한다.
	
	- 부모 클래스 타입에 자식 클래스 타입을 대입시켜 다형성이 구현된 메소드를 실행한다.

*/

// 부모 클래스
class Shape {
	
	// 자녀클래스가 상속받아서 사용할 메서드를 정의
	void draw() {}
	
}

class Line extends Shape {
	
	// 부모 메서드를 재정의하여 사용
	void draw() {
		System.out.println("선을 그린다.");
	}
	
}

class Circle extends Shape {
	
	// 부모 메서드를 재정의하여 사용
	void draw() {
		System.out.println("원을 그린다.");
	}
	
}

class Rect extends Shape{
	
	// 부모 메서드를 재정의하여 사용
	void draw() {
		System.out.println("사각형을 그린다.");
	}
	
}


public class TechniqueEx12 {

	public static void main(String[] args) {

		Shape[] shapeList = new Shape[3];
		
		shapeList[0] = new Line();
		shapeList[1] = new Circle();
		shapeList[2] = new Rect();
		
		shapeList[0].draw();
		shapeList[1].draw();
		shapeList[2].draw();
		
		// 참고자료 1)
		ArrayList<Object> test1 = new ArrayList<Object>();
		test1.add(100);
		test1.add("문자열");
		test1.add(true);
		test1.add(new Parent());  // Parent 객체
		test1.add(new ProductDTO());  // ProductDTO 객체
		
		// 참고자료 2)
		HashMap<String, Object> test2 = new HashMap<String, Object>();
		test2.put("data1", 100);
		test2.put("data2", "문자열");
		test2.put("data3", true);
		test2.put("data4", new Parent());
		test2.put("data5", new ProductDTO());

	}

}


