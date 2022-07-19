package ch03;

/*
 * 팩토리 패턴 ( 팩토리 메서드 패턴 Factory Method Pattern )
 * 
 * 1. 디자인 패턴중에 가장 유명한 디자인 패턴중에 하나인 팩토리 패턴이다.
 * 
 * 2. 생성 패턴이다.
 * 		- 인스턴스를 만드는 ( 객체를 만드는 ) 절차를 추상화하는 패턴이다.
 * 		- 객체를 생성, 합성하는 방법이나 객체의 표현 방법을 시스템과 분리해 준다. 
 * 		- 시스템이 상속보다 복합 방법을 사용하는 방향으로 진화되어 가면서 중요성이 더해지고 있다.
 * 
 * 3. 중요한 이슈 2가지가 있다. 
 * 		- 시스템이 어떤 Concrete Class ( 구체적인 클래스 ) 를 사용하는지에 대한 정보를 캡슐화 한다. 
 * 		- 이들 클래스의 인스턴스들이 어떻게 만들고 어떻게 결합하는지에 대한 부분을 완전히 가려준다. 
 * 
 * 
 * 결론
 * 
 * 팩토리 패턴이란
 * 객체를 생성하는 인터페이스는 미리 정의하되, 인스턴스를 만들 클래스에 결정은 서브클래스 쪽에서 내리는 패턴이다.
 * 여러개의 서브클래스를 가진 슈퍼클래스가 있을때 인풋에 따라 하나의 자식클래스를 인스턴스 해서 리턴해주는 방식이다. 
 * 
 * 팩토리 패턴에서는 클래스에 인스턴스를 만드는 시점을 서브 클래스로 미룬다. 
 * 
 * 언제 활용하나?
 * 어떤 클래스가 자신이 생성해야 하는 객체의 클래스를 예측할 수 없을때 
 * 생성할 객체를 기술하는 책임을 자신이 아니고 서브 클래스가 지정했으면 할 때 
 * 
 * 
 * 팩토리 패턴의 장점 
 * 클라이언트 코드로 부터 서브클래스의 인스턴스화를 제거하여 서로간에 종속성을 낮추고 
 * 결합도를 느슨하게 하며 확장을 쉽게 한다.
 * 
 * PC 클래스에 대해서 수정 혹은 삭제가 일어나더라도 클라이언트는 알수 없기때문에 코드를 변경할 필요도 없다. 
 * 
 * 팩토리 패턴은 클라이언트와 구현 객체들 사이에 추상화를 제공한다. ( 팩토리 클래스 )
 * 
 */
public class MainTest {

	public static void main(String[] args) {
		Computer computer = ComputerFactory.getComputer("PC", "32GB", "1TB", "ARM");
		System.out.println(computer);
		
		Computer computer2 = ComputerFactory.getComputer("NoteBook", "16GB", "500GB", "Intel");
		System.out.println(computer2);
	}

}
