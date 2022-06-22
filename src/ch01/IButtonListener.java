package ch01;

// 옵저버 패턴
// 1. 인터페이스를 선언한다. 
@FunctionalInterface
public interface IButtonListener {
	void clickEvent(String event);
}
