package codes.gorillu.simplecoreapp.controller;

import codes.gorillu.simplecoreapp.services.GreetingService;

/**
 * Project: simple-core-app
 * Created by: luis
 * Date: 02.03.2025
 * Time: 14:40
 */
public class ConstructorInjectedController {

    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreetings();
    }
}
