package codes.gorillu.simplecoreapp.controller;

import codes.gorillu.simplecoreapp.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Project: simple-core-app
 * Created by: luis
 * Date: 02.03.2025
 * Time: 13:36
 */
class PropertyInjectedControllerTest {

     PropertyInjectedController propertyInjectedController;

    @BeforeEach
    void setUp() {
       propertyInjectedController = new PropertyInjectedController();
       propertyInjectedController.greetingService = new GreetingServiceImpl();
    }


    @Test
    void greeting() {
        System.out.println(propertyInjectedController.greeting());
    }
}