package codes.gorillu.simplecoreapp.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Project: simple-core-app
 * Created by: luis
 * Date: 02.03.2025
 * Time: 13:25
 */
class MyControllerTest {


    @Test
    void sayHello() {
        MyController controller = new MyController();

        System.out.println(controller.sayHello());
    }
}