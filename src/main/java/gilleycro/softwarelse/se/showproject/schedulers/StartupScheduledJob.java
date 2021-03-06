package gilleycro.softwarelse.se.showproject.schedulers;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.map.IMap;
import gilleycro.softwarelse.se.showproject.model.User;
import gilleycro.softwarelse.se.showproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class StartupScheduledJob {

    private final HazelcastInstance hazelcastInstance = Hazelcast.getHazelcastInstanceByName("hazel-instance");
    IMap<Long, User> map = hazelcastInstance.getMap("users");

    @Autowired
    UserRepository userRepository;

    //sync hazelcast with db
    @EventListener(ApplicationReadyEvent.class)
    public void loadData() {
           //do nothing
    }

}
