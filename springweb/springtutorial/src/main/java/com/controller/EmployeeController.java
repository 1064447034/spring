package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.domain.Employee;

@Controller
public class EmployeeController {
	@RequestMapping(value = "employee_input")
	public String inputEmployee(Model model) {
		model.addAttribute(new Employee());
		return "EmployeeForm";
	}
	
	@RequestMapping(value = "employee_save") 
	public String saveEmployee(@ModelAttribute Employee employee, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			FieldError fieldError = bindingResult.getFieldError();
			System.out.println("code: " + fieldError.getCode() + " field: " + fieldError.getField());
			return "EmployeeForm";
		}
		model.addAttribute("employee", employee);
		return "EmployeeDetails";
	}
	
}
