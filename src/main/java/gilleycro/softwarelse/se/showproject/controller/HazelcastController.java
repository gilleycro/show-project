package gilleycro.softwarelse.se.showproject.controller;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.map.IMap;
import gilleycro.softwarelse.se.showproject.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/hazelcast")
public class HazelcastController {

    private final HazelcastInstance hazelcastInstance = Hazelcast.getHazelcastInstanceByName("hazel-instance");
    IMap<Long, User> map = hazelcastInstance.getMap("users");

    @GetMapping("/all")
    public List<User> getAllFromMap(){
        return map.values().stream().collect(Collectors.toList());
    }
}
