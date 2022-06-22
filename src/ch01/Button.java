package ch01;

// 호출자 역할 
// 2. 호출을 한다
public class Button {

	private String name;
	private IButtonListener iButtonListener;

	// null포인트 연결
	// 2가지 방법 (생성자로 연결, 메서드로 연결 (setter) )
	public void setiButtonListener(IButtonListener iButtonListener) {
		this.iButtonListener = iButtonListener;
	}

	public Button(String name) {
		this.name = name;
	}

	public void click(String message) {
		iButtonListener.clickEvent(message);
	}
}
