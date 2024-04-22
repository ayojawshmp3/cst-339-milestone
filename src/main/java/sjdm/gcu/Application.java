package sjdm.gcu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//localhost:8080/

@SpringBootApplication
@ComponentScan({ "sjdm.gcu" })
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
//		String encoded = new BCryptPasswordEncoder().encode("sk8ayo");
//		System.out.println(encoded);
	}
}
