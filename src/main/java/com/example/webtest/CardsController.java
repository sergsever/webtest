package com.example.webtest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cards")
public class CardsController {
	@GetMapping
	public String getCards()
	{
		return "cards:";
	}

}
