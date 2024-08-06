package homework240729;

public class operatorException extends RuntimeException{ //사용자 예외
	
	public operatorException(String message) { //예외 발생 원인을 파라미터로 전달
		super(message);
	}
}
