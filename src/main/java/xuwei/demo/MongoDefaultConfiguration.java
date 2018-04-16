package xuwei.demo;

import com.mongodb.MongoClientURI;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.core.mapping.MongoMappingContext;

/**
 * Created by xuwei on 2018/4/16.
 */
@Configuration
public class MongoDefaultConfiguration {
    @Value("${spring.data.mongodb.uri}")
    private String MONGO_URI;

    @Bean
    public MongoMappingContext mongoMappingContext() {
        MongoMappingContext mappingContext = new MongoMappingContext();
        return mappingContext;
    }


    @Bean
    @Primary
    public MongoDbFactory dbFactory() {
        return new SimpleMongoDbFactory(new MongoClientURI(MONGO_URI));
    }

    @Bean
    @Primary
    public MongoTemplate mongoTemplate() {
        return new MongoTemplate(this.dbFactory());
    }
}
