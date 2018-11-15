package com.spittr.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spittr.data.SpittleRepository;

@Controller
@RequestMapping("/spittles")
public class SpittleController {
//
//	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public String home() {
//		return "home";
//	}
	
	private SpittleRepository spittleRepository;
	@Autowired
	public SpittleController(SpittleRepository spittleRepository) {
		super();
		this.spittleRepository = spittleRepository;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public String spittles(Model model) {
		model.addAttribute(spittleRepository.findSpittles(Long.MAX_VALUE, 20));
		return "spittles";
	}
}