package ar.com.educacionit.dao.user;

import ar.com.educacionit.app.domain.User;
import ar.com.educacionit.dao.exceptions.GenericException;

public interface UserRepository {

	public User getUser(String userName) throws GenericException;
}
