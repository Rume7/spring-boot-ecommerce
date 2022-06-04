package com.codehacks.ecommerce.dao;

import com.codehacks.ecommerce.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Rhume Disi
 * @date June 2, 2022
 */
@CrossOrigin("http://localhost:4200")
public interface ProductRepository extends JpaRepository<Product, Long>{
    
    Page<Product> findByCategoryId(@RequestParam("id") Long id, Pageable pageable);

}
