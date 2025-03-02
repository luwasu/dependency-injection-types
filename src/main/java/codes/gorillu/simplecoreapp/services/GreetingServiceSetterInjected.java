package codes.gorillu.simplecoreapp.services;

import org.springframework.stereotype.Service;

/**
 * Project: simple-core-app
 * Created by: luis
 * Date: 02.03.2025
 * Time: 20:27
 */
@Service("greetingServiceSetterInjections")
public class GreetingServiceSetterInjected implements GreetingService {

    @Override
    public String sayGreetings() {
        return "I`m setting a Greeting Service!!!";
    }
}
