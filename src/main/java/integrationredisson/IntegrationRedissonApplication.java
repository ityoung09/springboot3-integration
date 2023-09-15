package integrationredisson;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@MapperScan("integrationredisson.dao")
@SpringBootApplication
public class IntegrationRedissonApplication {

    public static void main(String[] args) {
        SpringApplication.run(IntegrationRedissonApplication.class, args);
    }

}
