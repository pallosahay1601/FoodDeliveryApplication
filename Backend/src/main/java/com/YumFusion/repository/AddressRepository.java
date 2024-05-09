package com.YumFusion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.YumFusion.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
