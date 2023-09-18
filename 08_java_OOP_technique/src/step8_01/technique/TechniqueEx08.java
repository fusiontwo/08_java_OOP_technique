package step8_01.technique;

/*
 * 
 *  # this , super
 * 
 * 	- this : 자신의 객체
 *    super : 부모클래스의 객체
 *  
 *  - this() : 자신의 생성자
 *    super() : 부모클래스의 생성자
 *  
 *  - this.testMethod() : 자신의 메서드 호출
 *    testMethod()		: 자신의 메서드 호출
 *    super.testMethod() : 부모의 메서드 호출
 * 
 * */

class Parent {
	
	String name = "parent";
	int age = 70;
	
	// 생성자
	Parent() {
		this("무명", -1);
		System.out.println("(P-기본) 부모클래스의 기본생성자 실행");
	}
	
	Parent(String name, int age) {
		System.out.println("(P-추가) 부모클래스의 추가된 생성자 실행");
	}
	
	void testMethod() {
		System.out.println("(P)부모클래스의 테스트 메서드");
	}
	
}

class Child extends Parent{
	
	String name = "child";
	int age = 40;
	
	
//	// 자동 생성 생성자
//	public Child() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
	
	// 생성자
	Child() {
		super();  // 부모 클래스의 기본 생성자를 실행 (기본적으로 생략되어 있다.)
		// super("무명", -1);  // 부모 클래스의 추가된 생성자를 실행
		System.out.println("(C-기본) 자녀클래스의 기본생성자 실행");
	}

	Child(String name, int age) {
		this();
//		super();
//		super("무명", -1);
		
		System.out.println("(C-추가) 자녀클래스의 추가된 생성자 실행");
	}
	
	void testMethod() {
		System.out.println("(C)자녀클래스의 테스트 메서드");
	}
	
	void printMethod() {
		
		System.out.println(super.name);  // 부모 클래스의 변수
		System.out.println(super.age);  // 부모 클래스의 변수
		
		System.out.println(this.name);  // 자신의 변수
		System.out.println(this.age);  // 자신의 변수
		
		super.testMethod();  // 오버라이딩 하기 전 부모 메서드
		this.testMethod();  // 자신의 메서드
		testMethod();  // 자신의 메서드
	}
	
}


public class TechniqueEx08 {

	public static void main(String[] args) {
		
		// (P-추가) 부모클래스의 추가된 생성자 실행
		// (P-기본) 부모클래스의 기본생성자 실행
		new Parent();
		System.out.println();
		
		// (P-추가) 부모클래스의 추가된 생성자 실행
		new Parent("제임스고슬링", 70);
		System.out.println();
		
		// (P-추가) 부모클래스의 추가된 생성자 실행
		// (P-기본) 부모클래스의 기본생성자 실행
		// (C-기본) 자녀클래스의 기본생성자 실행
		new Child();
		System.out.println();
		
		// (P-추가) 부모클래스의 추가된 생성자 실행
		// (P-기본) 부모클래스의 기본생성자 실행
		// (C-기본) 자녀클래스의 기본생성자 실행
		// (C-추가) 자녀클래스의 추가된 생성자 실행
		Child object = new Child("제임스고슬링 주니어", 40);
		System.out.println();
		
		object.printMethod();
	}

}
