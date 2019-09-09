package important_interfaces.ApplicationRunnerExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import important_interfaces.ApplicationRunnerExample.service.MessageProviderService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
		MessageProviderService msp = ctx.getBean(MessageProviderService.class);
		System.out.println(msp.message());
	}

}
