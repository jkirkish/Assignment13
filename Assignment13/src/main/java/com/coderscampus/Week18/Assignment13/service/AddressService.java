package com.coderscampus.Week18.Assignment13.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderscampus.Week18.Assignment13.domain.Address;
import com.coderscampus.Week18.Assignment13.repository.AddressRepository;

@Service
public class AddressService {
	
	@Autowired
	private AddressRepository addressRepo;
	
	public Address save (Address address) {
		return addressRepo.save(address);
	}
}