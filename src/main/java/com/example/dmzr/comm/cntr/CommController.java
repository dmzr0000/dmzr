package com.example.dmzr.comm.cntr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("dmzr/comm")
public class CommController {

	@GetMapping("cntr1")
	public String cntr1() {
		return "cntr1";
	}

}
