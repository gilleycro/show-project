package gilleycro.softwarelse.se.showproject.service;

import gilleycro.softwarelse.se.showproject.model.User;
import gilleycro.softwarelse.se.showproject.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void saveUser(User p){
        userRepository.save(p);
    }

    public List<User> getAll(){
        return userRepository.findAll();
    }

}
