package xuwei.demo;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * Created by xuwei on 2018/4/16.
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(MongoDefaultConfiguration.class)
public @interface EnableMongo {
}
