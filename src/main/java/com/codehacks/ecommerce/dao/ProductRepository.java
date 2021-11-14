package com.codehacks.ecommerce.dao;

import com.codehacks.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Rhume
 */
public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
