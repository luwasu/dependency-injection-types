package codes.gorillu.simplecoreapp.controller;

import codes.gorillu.simplecoreapp.services.GreetingService;

/**
 * Project: simple-core-app
 * Created by: luis
 * Date: 02.03.2025
 * Time: 13:27
 */
public class PropertyInjectedController {

    GreetingService greetingService;

    public String greeting() {
        return greetingService.sayGreetings();
    }
}
