package surgedemo.SpringBootConfiguration.servicee;

import java.util.List;

import surgedemo.SpringBootConfiguration.bean.User;


public interface UserService {

	public List<User> getAllUser();

	public User getUserById(int id);

	

//	User getUserById(int id);
}