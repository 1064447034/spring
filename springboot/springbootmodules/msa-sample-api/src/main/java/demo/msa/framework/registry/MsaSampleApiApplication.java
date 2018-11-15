package demo.msa.framework.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages="demo.msa")
@RestController
public class MsaSampleApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsaSampleApiApplication.class, args);
	}
	
	@RequestMapping(name="HelloServcie", method=RequestMethod.GET, path="/hello")
	public String hello() {
		return "hello";
	}
}
