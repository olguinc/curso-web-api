package ar.com.educacionit.services.exceptions;

public class ServiceException extends Exception {

	private static final long serialVersionUID = 1564767144748786222L;

	public ServiceException(String message) {
		super(message);
	}

	public ServiceException(String message, Exception e) {
		super(message, e);
	}

}
