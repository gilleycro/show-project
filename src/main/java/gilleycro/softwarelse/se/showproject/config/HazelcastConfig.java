package gilleycro.softwarelse.se.showproject.config;

import com.hazelcast.config.Config;
import com.hazelcast.config.InMemoryFormat;
import com.hazelcast.config.MapConfig;
import com.hazelcast.config.NearCacheConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HazelcastConfig {

    @Bean
    public Config cacheConfig() {
        //todo: enable near cache
        var nearCacheConfig = new NearCacheConfig()
                .setInMemoryFormat(InMemoryFormat.OBJECT)
                .setCacheLocalEntries(true)
                .setInvalidateOnChange(false);


        return new Config()
                .setInstanceName("hazel-instance")
                .addMapConfig(new MapConfig()
                        .setName("users")
                        .setName("jobs"));

    }
}


