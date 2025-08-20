package com.myecom.gp_Ecom.repositories;

import com.myecom.gp_Ecom.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
