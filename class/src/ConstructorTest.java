
public class ConstructorTest {
	String name;

	/**
	 * 클래스 내부에 어떤 형태의 생성자가 하나라도 있다면 자바 컴파일러(javac)는 기본 형태의 생성자(파라미터가 없는 생성자)를 만들어 주지
	 * 않는다
	 */
	public ConstructorTest(String name) {
		System.out.println("ConstructorTest 인스턴스를 생성합니다.");
		// 인스턴스가 생성된 직후에 아래 코드가 실행
		this.name = name;
	}
}
