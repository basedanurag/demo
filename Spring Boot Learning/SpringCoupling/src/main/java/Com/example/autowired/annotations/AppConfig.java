package Com.example.autowired.annotations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan(basePackages = "Com.example.autowired.annotations")
public class AppConfig {
}
