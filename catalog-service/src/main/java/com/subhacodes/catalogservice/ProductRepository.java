package com.subhacodes.catalogservice;

import com.subhacodes.catalogservice.Product;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends JpaRepository<Product, Long>{
    Optional<Product> findByCode(String code);
}
