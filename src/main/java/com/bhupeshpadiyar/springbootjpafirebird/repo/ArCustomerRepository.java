package com.bhupeshpadiyar.springbootjpafirebird.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bhupeshpadiyar.springbootjpafirebird.model.ArCustomer;

@Repository
public interface ArCustomerRepository extends JpaRepository<ArCustomer, Long> {

}
