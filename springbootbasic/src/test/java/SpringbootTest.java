import hello.Application;
import hello.entity.User;
import hello.enums.UserSexEnum;
import hello.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes= Application.class)
public class SpringbootTest {

    @Autowired
    UserMapper userMapper;

    @Test
    public void contextLoads(){
        System.out.println(UserSexEnum.valueOf("MAN"));
        System.out.println(UserSexEnum.WOMAN);
        System.out.println(UserSexEnum.WOMAN.toString());
        boolean bj = (1 == (new Integer(1)));
        System.out.println(bj);
    }

    @Test
    public void testJdbc(){
        List<User> users =  userMapper.getAll();
        System.out.println(users);
    }
}
