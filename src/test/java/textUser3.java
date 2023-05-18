
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

public class textUser3 {
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
        /*将id=4这⻔课程的课时数修改为32+8=40;*/
        User user=new User();
        user.setId(4);
        user.setHours(40);
        user.setName("计算机学院");
        user.setSchools(1);
        mapper.update_hours(user);
        sqlSession.commit();
        sqlSession.close();
    }
}