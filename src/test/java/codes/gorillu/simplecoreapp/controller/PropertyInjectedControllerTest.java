package codes.gorillu.simplecoreapp.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Project: simple-core-app
 * Created by: luis
 * Date: 02.03.2025
 * Time: 13:36
 */
@SpringBootTest
class PropertyInjectedControllerTest {

    @Autowired
     PropertyInjectedController propertyInjectedController;

    @Test
    void greeting() {
        System.out.println(propertyInjectedController.greeting());
    }
}