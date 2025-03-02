package codes.gorillu.simplecoreapp.services.i18N;

import codes.gorillu.simplecoreapp.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Project: simple-core-app
 * Created by: luis
 * Date: 02.03.2025
 * Time: 22:03
 */
@Profile("DE")
@Service("i18NService")
public class GermanGreetingService implements GreetingService {

    @Override
    public String sayGreetings() {
        return "Hallo ich bin der Deutsche Greeting Service!";
    }
}
