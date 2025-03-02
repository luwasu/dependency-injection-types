package codes.gorillu.simplecoreapp.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Project: simple-core-app
 * Created by: luis
 * Date: 02.03.2025
 * Time: 14:41
 */
@SpringBootTest
class ConstructorInjectedControllerTest {

    @Autowired
    ConstructorInjectedController controller;

    @Test
    void sayHello(){
        System.out.println(controller.sayHello());
    }
}