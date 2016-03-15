package com.sapient.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sapient.entity.CarRental;

@Controller
public class ShowRequestController {
	@RequestMapping("/showAll")
	public String getAllRequests(Model mdl){
		List<CarRental> data=new ArrayList<CarRental>();
		data.add(new CarRental("Amber",7209453559L,"asingh@sapient.com","Mustang"));
		data.add(new CarRental("Shikha",95450587984L,"sshikha@sapient.com","Nano"));
		data.add(new CarRental("Shilpii",78415964522L,"sshilpii@sapient.com","Activa"));
		mdl.addAttribute("dataList",data);
		return "ShowAllRequests";
	}
}
