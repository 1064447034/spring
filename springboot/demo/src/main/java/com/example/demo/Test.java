package com.example.demo;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/test")
public class Test {
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public Weather hello() {
		System.out.println();
		Weather w = new Weather();
		w.setCity("shanghai");
		w.setDate(new Date());
		w.setWez("thunder");
		return w;
	}
}