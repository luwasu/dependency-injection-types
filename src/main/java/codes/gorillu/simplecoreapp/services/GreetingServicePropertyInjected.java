package codes.gorillu.simplecoreapp.services;

import org.springframework.stereotype.Service;

/**
 * Project: simple-core-app
 * Created by: luis
 * Date: 02.03.2025
 * Time: 20:09
 */
@Service("propertyGreetingService")
public class GreetingServicePropertyInjected implements GreetingService {
    @Override
    public String sayGreetings() {
        return "Friends don`t let friends do property injection!!!";
    }
}
