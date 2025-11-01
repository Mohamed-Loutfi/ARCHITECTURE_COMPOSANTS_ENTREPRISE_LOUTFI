package ma.formations.springmvcrestdatajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringmvcRestDataJpaApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringmvcRestDataJpaApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringmvcRestDataJpaApplication.class, args);
    }
}