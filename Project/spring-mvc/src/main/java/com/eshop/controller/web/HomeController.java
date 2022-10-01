package com.eshop.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller(value = "homeControllerOfWeb")
public class HomeController {
	@RequestMapping(value = "/trang-chu", method = RequestMethod.GET)
	   public ModelAndView homePage() {
	      ModelAndView mav = new ModelAndView("user/home");
	      return mav;
	}
	
	@RequestMapping(value = "/login")
	   public ModelAndView loginpage() {
	      ModelAndView mav = new ModelAndView("user/login");
	      return mav;
	}
	
	@RequestMapping(value = "/register")
	   public ModelAndView registerpage() {
	      ModelAndView mav = new ModelAndView("user/register");
	      return mav;
	}
	
	@RequestMapping(value = "/cart")
	   public ModelAndView cartpage() {
	      ModelAndView mav = new ModelAndView("user/cart");
	      return mav;
	}
	
	@RequestMapping(value = "/products")
	   public ModelAndView productspage() {
	      ModelAndView mav = new ModelAndView("user/products");
	      return mav;
	}
	
	@RequestMapping(value = "/product_details")
	   public ModelAndView product_detailspage() {
	      ModelAndView mav = new ModelAndView("user/product_details");
	      return mav;
	}
}