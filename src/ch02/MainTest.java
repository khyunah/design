package ch02;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Base64;
import java.util.Base64.Decoder;

// 전략 패턴
public class MainTest {

	public static void main(String[] args) {
		
		String text = "안녕하세요 반갑습니다. 비밀번호는 1234야";
		String text2 = "http://localhost:9090/user?username=abc";
		
		Base64Strategy base64Strategy = new Base64Strategy();
		NormalStrategy normalStrategy = new NormalStrategy();
		AppendStrategy appendStrategy = new AppendStrategy();
		HttpStrategy httpStrategy = new HttpStrategy();
		
		Encoder encoder = new Encoder();
		encoder.setEncodingStrategy(base64Strategy);
		
		// 인코딩
		String encodingString = encoder.getMessage(text2);
		System.out.println(encodingString);
		
		// 디코딩
		try {
			String result = URLDecoder.decode(encodingString, "UTF-8");
			System.out.println(result);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		Decoder decoder = Base64.getDecoder();
		byte[] byte1 = decoder.decode(encodingString.getBytes());

		System.out.println(new String(byte1));
	}

}
