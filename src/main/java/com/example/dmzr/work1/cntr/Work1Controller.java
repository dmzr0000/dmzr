package com.example.dmzr.work1.cntr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("dmzr/work1")
public class Work1Controller {

	@GetMapping("cntr1")
	public String cntr1() {
		return "cntr1";
	}

}
