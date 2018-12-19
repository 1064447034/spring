package com.yiibai.xml;

import java.io.InputStream;

import javax.validation.Valid;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

@Controller
@RequestMapping("/hello")
public class ParseXmlController {

	@RequestMapping(value="/123", consumes = {"application/json;charset=UTF-8"}, produces = {"application/json;charset=UTF-8"}, method = RequestMethod.POST)
	@ResponseBody
	public Request printHello(@Valid @RequestBody Request request, BindingResult bindingResult) {
		System.out.println(JSON.toJSONString(request));
		return request;
	}
	
	@RequestMapping(value="/sendxml", consumes={"application/xml"}, method=RequestMethod.POST) 
	@ResponseBody
	public Book sendXml(@RequestBody Book book) {
		System.out.println(JSON.toJSONString(book));
		System.out.println();
		return book;
	}
	
	@RequestMapping(value="/readXml", method=RequestMethod.POST)
	@ResponseBody
	public Book readxml() throws Exception {
		System.out.println(this.getClass().getResource("/").toString());
		this.getClass().getClassLoader().getResourceAsStream("");
		
		System.out.println(Thread.currentThread().getContextClassLoader().getResource("/").getPath());
		
		JAXBContext context = JAXBContext.newInstance(Book.class);
		Unmarshaller unmar = context.createUnmarshaller();
//		System.out.println(this.getClass().getResource("book.xml"));
		InputStream is = this.getClass().getResourceAsStream("/com/ly/FirstSpring/book.xml");
		Book book = (Book)unmar.unmarshal(is);
		System.out.println(JSON.toJSONString(book));
		return book;
//		ResourceBundle
	}
	
	@RequestMapping(value="/test", method=RequestMethod.GET)
	@ResponseBody
	public String test() {
		return "this is a test";
	}
}