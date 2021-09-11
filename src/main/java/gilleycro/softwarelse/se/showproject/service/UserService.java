package gilleycro.softwarelse.se.showproject.service;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.map.IMap;
import gilleycro.softwarelse.se.showproject.model.User;
import gilleycro.softwarelse.se.showproject.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    private final HazelcastInstance hazelcastInstance = Hazelcast.getHazelcastInstanceByName("hazel-instance");
    IMap<Long, User> map = hazelcastInstance.getMap("users");

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void saveUser(User p){
        var user = userRepository.save(p);
        map.put(user.getId(), user);
    }

    public List<User> getAll(){
        if(map == null){
            return userRepository.findAll();
        }
        return map.values().stream().collect(Collectors.toList());
    }

}
