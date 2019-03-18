package vnx.springcourse.chuck.controllers;

import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;
import vnx.springcourse.chuck.services.*;

@Controller
public class JokeController {

	private final String JOKES = "jokes";
	private final JokeService jokeService;

	public JokeController(JokeService jokeService) {

		this.jokeService = jokeService;
	}

	@RequestMapping("/" + JOKES)
	public String getJokes(Model model) {

		model.addAttribute(JOKES, jokeService.chuckQuote());

		return JOKES;
	}

}
