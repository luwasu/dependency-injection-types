package codes.gorillu.simplecoreapp;

import codes.gorillu.simplecoreapp.controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SimpleCoreAppApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SimpleCoreAppApplication.class, args);

        MyController controller = ctx.getBean(MyController.class);
        System.out.println("I am in the Main Method");

        System.out.println(controller.sayHello());
    }
}
