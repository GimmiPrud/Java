package com.spring.first.Controller;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/lista_num")
public class lista_numeri_controller {
	
	@GetMapping(path = "lista")
	public ArrayList<Integer> numeri(){
		ArrayList<Integer> n = new ArrayList<Integer>();
		for (Integer i = 0;i<5;i++) {
			n.add((int) (Math.random()*101));
		}
		return n;
		
	}

}
