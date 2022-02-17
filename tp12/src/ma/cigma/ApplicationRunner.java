package ma.cigma;
import org.springframework.boot.SpringApplication;
importorg.springframework.boot.autoconfigure.EnableAutoConfiguration;
org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
@SpringBootApplication


import ma.cigma.pfe.presentation.clientcontroller;
public class ApplicationRunner {
	SpringApplication.run(ApplicationRunner.class, args);

}
