
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

public class textUser2 {
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
        /*查询出所有计算机学院开设的课程信息*/
        List<User> users = mapper.selectBy_school_name("计算机学院");
        System.out.println(users);
    }
}