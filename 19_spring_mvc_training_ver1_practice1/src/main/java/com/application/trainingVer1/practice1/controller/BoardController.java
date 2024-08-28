package com.application.trainingVer1.practice1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {

	@GetMapping
	public String main() {
		return "board/boardMain";
	} 
	
	@GetMapping("/createBoard")
	public String createBoard() {
		return "board/createBoard";
	}
}
