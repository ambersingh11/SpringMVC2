package com.sapient.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.sapient.entity.CarRental;

@Controller
//@RequestMapping("/ShowForm")
@SessionAttributes("command")
public class CarRentalController {
	@Autowired
	private CarRental car;
	@Autowired
	private ModelAndView mdl;
	@RequestMapping("/check")
	public String checkStatus(@RequestParam("name") String name,Model mdl){
		mdl.addAttribute("lastBooking","Your Last booking was on 15th Aug 2014");
		return "Success";
	}
	@RequestMapping(name="/ShowForm",method=RequestMethod.GET)
	public ModelAndView showForm(){
		mdl.setViewName("ShowForm");
		mdl.addObject("command",car);
		return mdl;
	}
	@RequestMapping(name="/ShowForm",method=RequestMethod.POST)
	public String onSubmit(@Valid @ModelAttribute("command") CarRental car,BindingResult result){
		if(result.hasErrors())
			return "ShowForm";
		return "Success";
	}
	
	@ModelAttribute("type")
	public List<String> carType(){
		List<String> types=new ArrayList<String>();
		types.add("Indica");
		types.add("Vista");
		types.add("Chevrolet");
		types.add("Mustnag");
		return types;
	}
	
}
