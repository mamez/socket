package com.edu.poli.socket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pais")
public class PaisController {
	
	public String inicio() {
		return "pais";
	}

}
