package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.domain.Product;
import com.form.ProductForm;
import com.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService productService;
	
	
	@RequestMapping(value = "/product_input")
	private String inputProduct() {
		return "ProductForm";
	}
	
	@RequestMapping(value = "/product_save", method = RequestMethod.POST)
	public String saveProduct(ProductForm productForm, Model model) {
		Product product = new Product();
		product.setName(productForm.getName());
		product.setDescription(productForm.getDescription());
		product.setPrice(Float.valueOf(productForm.getPrice()));
		
		model.addAttribute("product", product);
		return "ProductDetails";
	}
	
	@RequestMapping(value = "/product_save2", method = RequestMethod.POST)
	public String saveProduct2(ProductForm productForm, RedirectAttributes redirectAttributes) {
		Product product = new Product();
		product.setName(productForm.getName());
		product.setDescription(productForm.getDescription());
		product.setPrice(Float.valueOf(productForm.getPrice()));
		
		Product saveProduct = productService.add(product);
		redirectAttributes.addFlashAttribute("message", "the product was successfully added.");
		return "redirect:/product_view/" + saveProduct.getId();
	}

	@RequestMapping(value = "/product_save3", method = RequestMethod.POST)
	public String saveProduct(Product product, Model model) {
		model.addAttribute("product", product);
		return "ProductDetails";
	}
	
	@RequestMapping(value = "/product_view/{id}")
	public String viewProduct(@PathVariable Long id, Model model) {
		Product product = productService.get(id);
		model.addAttribute("product", product);
		return "ProductView";
		
	}
}
