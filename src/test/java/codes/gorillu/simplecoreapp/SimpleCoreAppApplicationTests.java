package codes.gorillu.simplecoreapp;

import codes.gorillu.simplecoreapp.controller.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class SimpleCoreAppApplicationTests {

    @Autowired
    ApplicationContext applicationContext;

    @Autowired
    MyController myController;



    @Test
    void testAutoWired() {
        System.out.println(myController.sayHello());
    }

    @Test
    void testControllerFromCtx() {
        MyController myController = applicationContext.getBean(MyController.class);
        System.out.println(myController.sayHello());
    }

    @Test
    void contextLoads() {
    }

}
