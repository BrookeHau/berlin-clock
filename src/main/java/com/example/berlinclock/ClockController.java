package com.example.berlinclock;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClockController {

	@RequestMapping("/clock")
	public String showClock() {
		return "index";
	}
}
