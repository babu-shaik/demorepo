package com.example.atm.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.atm.model.AtmServices;
import com.example.atm.repository.AtmServicesImpl;

@RestController
@RequestMapping("atmservices")
public class AtmServiceController {
	
	//user can check the balance
	//user can update his mobile number
	//user can delete pan number
	//user can transfer the amount
	@Autowired
	AtmServicesImpl repo;
	
	@GetMapping("/getBalance")
	public float getUserBalance(@RequestBody AtmServices services) {
		
	
		Optional<AtmServices> serviceObj = repo.findById(services.getId());
		AtmServices obj = serviceObj.get();
		
		return obj.getAmount();
	}
	
	@GetMapping("/getMobile")
	public int getUserMobileNumber() {
		
		return 0;
	}
	
	@PostMapping("/deposit")
	public String moneyDeposit(@RequestBody AtmServices services) {
		
		repo.save(services);
		
		return "Succefully deposited";
	}
	
	@PostMapping("/moneyTransfer")
	public String moneyTransfer(@RequestBody AtmServices services) {
		
		
		
		return "Transfered Sccefully";
	}

	@PutMapping("/updateMNumber")
	public String updateMobileNumber(@RequestBody AtmServices services) {
		
		repo.save(services);
		
		return "Mobile Number updated succefully";
	}
	@DeleteMapping("/deleteAccount")
	public String deletePanNumber(@RequestBody AtmServices services) {
		
		repo.deleteById(services.getId());
		
		return "Deleted Account succefully with this id "+services.getId();
		
	}
	
	
}
