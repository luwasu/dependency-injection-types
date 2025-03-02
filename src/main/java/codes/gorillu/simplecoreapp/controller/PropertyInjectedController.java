package codes.gorillu.simplecoreapp.controller;

import codes.gorillu.simplecoreapp.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Project: simple-core-app
 * Created by: luis
 * Date: 02.03.2025
 * Time: 13:27
 */
@Controller
public class PropertyInjectedController {

    @Autowired
    private GreetingService greetingService;

    public String greeting() {
        return greetingService.sayGreetings();
    }
}
