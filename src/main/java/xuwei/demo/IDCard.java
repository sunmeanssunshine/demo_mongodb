package xuwei.demo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by xuwei on 2018/4/16.
 */
@Data
@Document(collection = "IDcard")
public class IDCard {

    @Id
    private String id;

    private String idNumber;
    private String name;
    private GenderType gender;
    private String nation;
    private String birthday;

    private String validity;
    private String address;
    private String issuing;

    private String avatarUrl;
}
