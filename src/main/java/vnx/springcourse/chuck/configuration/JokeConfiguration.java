package vnx.springcourse.chuck.configuration;

import guru.springframework.norris.chuck.*;
import org.springframework.context.annotation.*;

@Configuration
public class JokeConfiguration {

	@Bean
	public ChuckNorrisQuotes quotes() {

		return new ChuckNorrisQuotes();
	}

}
