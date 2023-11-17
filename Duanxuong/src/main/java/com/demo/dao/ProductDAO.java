package com.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.demo.entity.Product;

public interface ProductDAO extends JpaRepository<Product, String> {
	@Query("SELECT p FROM Product p WHERE p.infomation.account.username = :pusername")
	List<Product> findByUsername(@Param("pusername") String pusername);

}
