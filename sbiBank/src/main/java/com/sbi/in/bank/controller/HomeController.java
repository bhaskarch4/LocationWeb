package com.sbi.in.bank.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sbi.in.bank.dao.UserDao;
import com.sbi.in.bank.domain.PrimaryAccount;
import com.sbi.in.bank.domain.User;
import com.sbi.in.bank.repos.UserRepository;
import com.sbi.in.bank.service.UserService;

@Controller
public class HomeController {

	@Autowired
	private UserService userService ;
	
	
	
	@RequestMapping("/")
	public String redirectToHomePage() {
	
		
		return "redirect:/index";
	}
	
	@RequestMapping("/bhaskar")
	public String createBhaskar() {
	  
		
		return "redirect:/";
	}
	
	@RequestMapping("/index")
	public String getHomePage() {
		
		return "index";
	}
	
	@RequestMapping("/signup")
	public String getHomePage(Model model) {
		User user = new User();
		model.addAttribute("user",user);
		
		return "signup";
	}
	
	@PostMapping(value = "/signup" )
	public String signupPost(@ModelAttribute("user") User user , Model model )  {
		
		  if(userService.userExists(user.getEmail(),user.getUserName())) {
		  if(userService.emailExists(user.getEmail())) { model.addAttribute("emailExists",true); }
		  if(userService.userNameExists(user.getUserName())) { model.addAttribute("userNameExists", true); }
		   return "signup"; 
		   } else { 
			  PrimaryAccount  primaryAccount = new PrimaryAccount();
			  primaryAccount.setAccountbalance(new BigDecimal(5000));
			  primaryAccount.setAccountNumber(1000000);
			  
			  user.setPrimaryAccount(primaryAccount);
			   
			   
			   userService.saveUser(user);  return "redirect:/"; }
	}
	
	
	@RequestMapping(value = "/userFront")
	public String getUserFront(@ModelAttribute("user") User user , Model model) {
		 PrimaryAccount  primaryAccount = new PrimaryAccount();
		  primaryAccount.setAccountbalance(new BigDecimal(5000));
		  primaryAccount.setAccountNumber(1000000);
		  
		  user.setPrimaryAccount(primaryAccount);
		  model.addAttribute("primaryAccount.accountBalance", primaryAccount.getAccountbalance());
		return "userFront";
	}
	
	}

