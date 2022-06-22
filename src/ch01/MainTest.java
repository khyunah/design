package ch01;

public class MainTest {

	public static void main(String[] args) {
		// 버튼 
		Button button = new Button("마이버튼");
		button.setiButtonListener(event -> {
			System.out.println("main에서 동작 넘겨 받은 메세지 : " + event);
		});
		
		button.click("클릭1");
		button.click("클릭2");
		button.click("클릭2");
	}
}
