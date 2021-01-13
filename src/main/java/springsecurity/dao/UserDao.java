package springsecurity.dao;

import springsecurity.entity.User;

public interface UserDao {

    User findByUserName(String userName);
    
    void save(User user);
    
}
