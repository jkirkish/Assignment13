package com.coderscampus.Week18.Assignment13.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coderscampus.Week18.Assignment13.domain.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{

}