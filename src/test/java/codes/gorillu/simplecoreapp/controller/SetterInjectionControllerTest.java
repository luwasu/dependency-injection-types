package codes.gorillu.simplecoreapp.controller;

import codes.gorillu.simplecoreapp.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Project: simple-core-app
 * Created by: luis
 * Date: 02.03.2025
 * Time: 13:45
 */
class SetterInjectionControllerTest {
    private SetterInjectionController setterInjectionController;

    @BeforeEach
    void setUp() {
        setterInjectionController = new SetterInjectionController();
        setterInjectionController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void sayHello() {
        System.out.println(setterInjectionController.sayHello());
    }
}