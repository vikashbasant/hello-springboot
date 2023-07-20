import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.kash.controller")
@EnableAutoConfiguration
public class HelloSpringBootApplication {
    public static void main(String[] args) {
        // start app from here:
        SpringApplication springApplication = new SpringApplication(HelloSpringBootApplication.class);
        springApplication.run();
    }
}
