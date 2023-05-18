
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

public class textUser5 {
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
        /*输出所有的学院开设的课程信息*/
        List<User> users = mapper.selectAll();
        System.out.println(users);

    }
}