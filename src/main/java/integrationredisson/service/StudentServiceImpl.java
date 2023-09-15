package integrationredisson.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import integrationredisson.dao.StudentMapper;
import integrationredisson.entity.Student;
import jakarta.annotation.Resource;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl {

    @Resource
    private StudentMapper studentMapper;

    @Cacheable(value = "kedaya", key = "'student:'+#id", unless = "#result==null")
    public Student queryStudent(Long id) {
        return studentMapper.selectById(id);
    }

    @CacheEvict(value = "kedaya", key = "'student:'+#student.SId")
    public void updateStudent(Student student) {
        studentMapper.updateById(student);
    }

    @CachePut(value = "kedaya", key = "'student:'+#student.SId", condition = "#student.SId != null")
    public Student addStudent(Student student) {
        studentMapper.insert(student);
        return student;
    }

}
