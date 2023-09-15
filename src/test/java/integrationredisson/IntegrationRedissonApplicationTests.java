package integrationredisson;

import integrationredisson.entity.Student;
import integrationredisson.service.StudentServiceImpl;
import integrationredisson.utils.RedisUtil;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;

@SpringBootTest
class IntegrationRedissonApplicationTests {

    @Resource
    private RedisUtil redisUtil;

    @Resource
    private StudentServiceImpl studentService;

    @Resource
    private CacheManager cacheManager;

    @Test
    void contextLoads() {
//        Student student = Student.builder().sId(1L).sName("王武").build();
//        studentService.updateStudent(student);
        System.out.println(studentService.queryStudent(1702500462323863554L));
        System.out.println(studentService.queryStudent(1L));
//        Student student = Student.builder().sName("张三123").sSex("男").build();
//        System.out.println(studentService.addStudent(student));
    }

}
