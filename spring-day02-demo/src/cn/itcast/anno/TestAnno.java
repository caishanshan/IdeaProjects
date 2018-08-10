package cn.itcast.anno;

import cn.itcast.xmlanno.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnno {
    @Test
    public void testUser(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        User user = (User) context.getBean("user");
//        System.out.println(user);
//        user.add();
//        UserService userService = (UserService) context.getBean("userService");
//        userService.testService();
        BookService bookService = (BookService) context.getBean("bookService");
        bookService.testService();
    }
}
