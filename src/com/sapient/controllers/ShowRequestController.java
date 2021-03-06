package com.sapient.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	@RequestMapping(value="/findRequest/{custName}/{custNumber}",method=RequestMethod.GET)
	public String getInfo(@PathVariable("custName") String custName,@PathVariable("custNumber") String custNumber, Model mdl){
		String msg="10 Bookings of "+custName+" found, Contact at: "+custNumber;
		mdl.addAttribute("data",msg);
		return "FindRequest";
	}
}
