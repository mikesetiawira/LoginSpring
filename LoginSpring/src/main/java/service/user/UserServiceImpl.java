package service.user;

import domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    //autowire to user repository
    @Autowired
    UserRepository userRepository;




    //this is a rather simple validation : is the username format correct (email kind of thing)? if it is correct, is the username is present? if it is present, is the username-password combination is present?
    @Override
    public User validate(String username, String password) {
        //check by its username first

        User user = userRepository.getOne(username);
        if(user==null){
            throw new UserNotFoundException(username);

        }
        //if user is found but the password is wrong
        else{
            user = userRepository.findByUsernameAndPassword(username, password);
            //if not found then the login is must be wrong
        }
        return user;
    }
}
