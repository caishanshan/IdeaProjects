package cn.itcast.anno;

import org.springframework.stereotype.Controller;

@Controller(value = "userDao")
public class UserDao {
    public void testDao(){
        System.out.println("烙铁，你确实调用了UserDao对象的方法=========");
    }
}
