package cn.itcast.xmlanno;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

public class BookService {

    @Resource(name="bookDao")
    private BookDao bookDao;

    @Autowired
    private OrdersDao ordersDao;

    public void testService(){
        System.out.println("烙铁，你正在调用BookService对象的方法========");
        bookDao.book();
        ordersDao.buy();
    }
}
