package cn.itcast.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
//通过注解创建对象，Service、Controller、Component、Repository
public class UserService {
//    通过注解注入属性，Autowired、Resource
    @Autowired
//@Resource
    private UserDao userDao;

    public void testService(){
        System.out.println("烙铁，你正在调用UserService对象的测试方法=========");
        userDao.testDao();
    }
}
