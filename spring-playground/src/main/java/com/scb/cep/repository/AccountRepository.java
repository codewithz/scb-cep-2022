package com.scb.cep.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scb.cep.entities.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {

}
