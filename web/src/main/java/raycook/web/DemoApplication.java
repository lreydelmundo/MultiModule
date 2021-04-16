package raycook.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@SpringBootApplication
//@ComponentScan(basePackages = {"raycook"})
//@SpringBootApplication(scanBasePackages = {"raycook.domain", "raycook.persistence", "raycook.web"})
// There are a few different ways you can define the packages that should be included in the Autowire
// package scan. I think the most concise is to simply add them to the @SpringBootApplication(scanBasePackages)
// argument. In this case it was easier to specify the TLD for the packages rather than each individual
// package.
@SpringBootApplication(scanBasePackages = {"raycook"})
@EnableJpaRepositories(basePackages = {"raycook.persistence"})
@EntityScan(basePackages = {"raycook.domain"})
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class);
    }
}
