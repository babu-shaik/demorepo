package com.example.atm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.atm.model.AtmServices;

@Repository
public interface AtmServicesImpl extends JpaRepository<AtmServices, Integer>{

  
}
