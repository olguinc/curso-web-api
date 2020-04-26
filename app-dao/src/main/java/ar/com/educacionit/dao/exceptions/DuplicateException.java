package ar.com.educacionit.dao.exceptions;

public class DuplicateException extends Exception {

	private static final long serialVersionUID = -4884498183208385351L;

	public DuplicateException(String message) {
		super(message);
	}

	public DuplicateException(String message, Exception e) {
		super(message, e);
	}

}
