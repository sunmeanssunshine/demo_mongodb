package xuwei.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by xuwei on 2018/4/16.
 */
@RestController
public class ApiController {

    @Autowired
    private MongoTemplate mongoTemplate;

    @GetMapping(value = "/test")
    public String test() {
        List<IDCard> cards = mongoTemplate.findAll(IDCard.class);
        return cards.get(0).getAvatarUrl();
    }
}
