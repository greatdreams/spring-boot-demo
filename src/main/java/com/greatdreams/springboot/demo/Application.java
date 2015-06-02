package com.greatdreams.springboot.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.core.annotation.AnnotationAwareOrderComparator;

/**
 *
 * @author greatdreams
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication();
        ApplicationContext ctx = app.run(Application.class, args);
        Set<ApplicationContextInitializer<?>> applicationInitializers = app.getInitializers();
        for (ApplicationContextInitializer initializer : applicationInitializers) {
            System.out.println(initializer.getClass().getName());
        }

        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println("\t" + beanName);
        }

        
        List<String> runners = new ArrayList<String>(ctx
                .getBeansOfType(CommandLineRunner.class).keySet());
        AnnotationAwareOrderComparator.sort(runners);
        for (String runner : runners) {
          System.out.println(runner);
        }
       // SpringApplication.run(Application.class, args);

    }
}
