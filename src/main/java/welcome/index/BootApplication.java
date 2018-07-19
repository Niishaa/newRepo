package welcome.index;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
@SpringBootApplication
public class BootApplication extends SpringBootServletInitializer{
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		return builder.sources(BootApplication.class);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("first commit");
		SpringApplication.run(BootApplication.class, args);

	}

	

}
