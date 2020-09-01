package surgedemo.SpringBootConfiguration.servicee;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import surgedemo.SpringBootConfiguration.bean.User;

@Component
public class UserServiceImpl implements UserService {
 
 private static List<User> users = new ArrayList<>();
 
 static {
  User admin = new User(1, "Admin", "admin@jackrutorial.com");
  User support = new User(2, "Support", "support@jackrutorial.com");
  User test = new User(3, "Test", "test@jackrutorial.com");
  
  users.add(admin);
  users.add(support);
  users.add(test);
 }
 
 @Override
public List<User> getAllUser() {
return users;
}
 
 
 @Override
public User getUserById(int id) {
for(User user : users) {
 if(user.getId() == id) {
  return user;
 }
}
return null;
}
 
}
 



//@Override
//public List<User> getAllUser() {
//	// TODO Auto-generated method stub
//	return null;
//}
//
////@Override
////public User getUserById(int id) {
////	// TODO Auto-generated method stub
////	return null;
////}
//
////@Override
////public List<User> getAllUser() {
////	// TODO Auto-generated method stub
////	return null;
////}
//
//}