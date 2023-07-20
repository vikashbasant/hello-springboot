import com.kash.controller.College;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootConfiguration
@ComponentScan("com.kash.controller")
@EnableAutoConfiguration
public class HelloSpringBootApplication {
    public static void main(String[] args) {
        // start app from here:
        SpringApplication springApplication = new SpringApplication(HelloSpringBootApplication.class);
        ConfigurableApplicationContext container = springApplication.run();

        College college = container.getBean(College.class); // college object:
        System.out.println("-------------------");
        System.out.println("college object: " + college);
        college.printCollegeName();
    }

    @Bean
    public College college() {
        return new College();
    }
}
