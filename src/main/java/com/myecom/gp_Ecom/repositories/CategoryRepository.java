package com.myecom.gp_Ecom.repositories;

import com.myecom.gp_Ecom.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.stereotype.Repository;
//import org.springframework.data.rest.core.annotation..JpaRepository;


@RepositoryRestResource
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
