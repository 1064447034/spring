package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerConfig {
//	@Bean
//	public CDPlayer cdplayer() {
//		System.out.println("new CDPlayer");
//		return new CDPlayer(sgtPeppers());
//	}
	
	@Bean
	public CDPlayer cdplayer(CompactDisc compactDisc) {
		System.out.println("new CDPlayer");
		return new CDPlayer(compactDisc);
	}
	
	@Bean
	public CompactDisc sgtPeppers() {
		System.out.println("new SgtPeppers");
		return new SgtPeppers();
	}
}
