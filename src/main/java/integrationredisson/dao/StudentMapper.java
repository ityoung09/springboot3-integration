package integrationredisson.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import integrationredisson.entity.Student;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentMapper extends BaseMapper<Student> {
}
