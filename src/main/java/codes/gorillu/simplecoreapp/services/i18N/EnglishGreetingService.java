package codes.gorillu.simplecoreapp.services.i18N;

import codes.gorillu.simplecoreapp.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Project: simple-core-app
 * Created by: luis
 * Date: 02.03.2025
 * Time: 20:47
 */
@Profile({"EN", "default"})
@Service("i18NService")
public class EnglishGreetingService implements GreetingService {

    @Override
    public String sayGreetings() {
        return "Hello I am the English Greeting Service!";
    }
}
