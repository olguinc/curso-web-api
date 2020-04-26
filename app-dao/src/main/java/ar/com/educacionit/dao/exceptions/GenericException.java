package ar.com.educacionit.dao.exceptions;

public class GenericException extends Exception {

	private static final long serialVersionUID = -1707850765954267852L;

	public GenericException(String message) {
		super(message);
	}

	public GenericException(String message, Exception e) {
		super(message, e);
	}

}
