
import com.cjy.Mapper.UserMapper;
import com.cjy.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class textUser4 {
    @Test
    public void text1() throws IOException {
        //Loading the core of mybatis
        String source = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(source);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //get sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //Gets the proxy object for the UserMapper interface
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        /*插入一条新的课程记录:names=”大数据存储“，hours=32，schools=1;*/
        User user=new User();
        user.setId(5);
        user.setHours(32);
        user.setName("大数据存储");
        user.setSchools(1);
        mapper.add(user);
        sqlSession.commit();
        sqlSession.close();
    }
}