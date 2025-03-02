package codes.gorillu.simplecoreapp.controller;

import codes.gorillu.simplecoreapp.services.GreetingService;
import codes.gorillu.simplecoreapp.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

/**
 * Project: simple-core-app
 * Created by: luis
 * Date: 27.02.2025
 * Time: 22:20
 */
@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }


    public String sayHello() {
        System.out.println("Hello from inside my controller!");
        return greetingService.sayGreetings();
    }
}
