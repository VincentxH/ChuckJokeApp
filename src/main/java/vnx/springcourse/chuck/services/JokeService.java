package vnx.springcourse.chuck.services;

import guru.springframework.norris.chuck.*;
import org.springframework.stereotype.*;

@Component
public class JokeService {

	private final ChuckNorrisQuotes quotes;

	public JokeService(ChuckNorrisQuotes quotes) {

		this.quotes = quotes;
	}

	public String chuckQuote() {

		return quotes.getRandomQuote();
	}

}
