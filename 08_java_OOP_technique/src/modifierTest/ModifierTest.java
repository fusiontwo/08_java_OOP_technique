package modifierTest;

public class ModifierTest {

	public int publicV;  // 같은 프로젝트 이므로 가능
	int defaultV;  // 같은 패키지 이므로 가능
	protected int protectedV;  // 상속관계 이므로 가능
	private int privateV;  // (불가) 다른 클래스이므로 불가능, private 파생 문법 : getter, setter
	
	public void publicM() {}  // 같은 프로젝트 이므로 가능
	
	void defaultM() {}  // 같은 패키지 이므로 가능
	
	protected void protectedM() {}  // 상속관계 이므로 가능
	
	private void privateM() {}  // (불가) 다른 클래스이므로 불가능, private 파생 문법 : getter, setter
	
}

class Test1 extends ModifierTest {
	
	void test() {
		System.out.println(publicV);
		System.out.println(defaultV);
		System.out.println(protectedV);
//		System.out.println(privateV);
		
		publicM();
		defaultM();
		protectedM();
//		privateM();
	}
}
