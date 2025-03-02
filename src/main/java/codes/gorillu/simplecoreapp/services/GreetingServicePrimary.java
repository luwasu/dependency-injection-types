package codes.gorillu.simplecoreapp.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Project: simple-core-app
 * Created by: luis
 * Date: 02.03.2025
 * Time: 17:04
 */
@Primary
@Service
public class GreetingServicePrimary implements GreetingService {

    @Override
    public String sayGreetings() {
        return "Hello from the Primary Bean!!!";
    }
}
