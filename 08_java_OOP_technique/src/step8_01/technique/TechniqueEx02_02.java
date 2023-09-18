package step8_01.technique;

import modifierTest.ModifierTest;

//public class PublicC {}  // (가능) : 하나의 클래스 파일에는 하나의 public 클래스만 존재할 수 있다.
class DefaultC {}  // (가능)
//protected class ProtectedC {}  // (불가능) : class 앞에는 public, default 접근 제어자만 사용 가능하다.
//private class PrivateC {}  // (불가능) : class 앞에는 public, default 접근 제어자만 사용 가능하다.

class Test1 extends ModifierTest {
	
	void test() {
		System.out.println(publicV);  // 같은 프로젝트 이므로 가능
//		System.out.println(defaultV);  // (불가) 다른 패키지이므로 불가능
		System.out.println(protectedV);  // 상속관계 이므로 가능
//		System.out.println(privateV);  // (불가) 다른 클래스이므로 불가능, private 파생 문법 : getter, setter
		
		publicM();  // 같은 프로젝트 이므로 가능
//		defaultM();  // (불가) 다른 패키지이므로 불가능
		protectedM();  // 상속관계 이므로 가능
//		privateM();  // (불가) 다른 클래스이므로 불가능, private 파생 문법 : getter, setter
	}
}