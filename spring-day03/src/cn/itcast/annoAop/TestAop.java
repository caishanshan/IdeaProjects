package cn.itcast.annoAop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {
    @Test
    public void testAop(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Book book = (Book) context.getBean("book");
        book.add();
    }
}
