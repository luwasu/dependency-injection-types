package codes.gorillu.simplecoreapp.services;

import org.springframework.stereotype.Service;

/**
 * Project: simple-core-app
 * Created by: luis
 * Date: 02.03.2025
 * Time: 13:16
 */
@Service
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreetings() {
        return "Hello Everyone from Base Service (GreetingServiceImpl)!!! ";
    }
}
