package codes.gorillu.simplecoreapp.controller;

import codes.gorillu.simplecoreapp.services.GreetingService;

/**
 * Project: simple-core-app
 * Created by: luis
 * Date: 02.03.2025
 * Time: 13:43
 */
public class SetterInjectionController {
    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreetings();
    }
}
