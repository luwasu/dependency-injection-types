package codes.gorillu.simplecoreapp.controller.Myi18NContoller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

/**
 * Project: simple-core-app
 * Created by: luis
 * Date: 02.03.2025
 * Time: 22:10
 */
@ActiveProfiles("EN")
@SpringBootTest
class Myi18NControllerTestEN {

    @Autowired
    private Myi18NController myi18NController;

    @Test
    void sayHello() {
       System.out.println(myi18NController.sayHello());

    }
}