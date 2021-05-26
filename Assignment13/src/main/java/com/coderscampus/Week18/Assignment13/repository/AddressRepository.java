package com.coderscampus.Week18.Assignment13.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.coderscampus.Week18.Assignment13.domain.Address;

public interface AddressRepository extends JpaRepository<Address, Long>{

}