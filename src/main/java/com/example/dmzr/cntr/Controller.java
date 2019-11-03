package com.example.dmzr.cntr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/cntr1")
	public String cntr1() {
		return "cntr1";
	}

}
