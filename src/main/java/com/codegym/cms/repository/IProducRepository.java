package com.codegym.cms.repository;

import com.codegym.cms.model.Category;
import com.codegym.cms.model.Product;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProducRepository extends PagingAndSortingRepository<Product,Long> {
    Iterable<Product> findAllByCategory(Category category);
    Iterable<Product> findAllByNameContaining(String name);

    Iterable<Product> findByName(String name);
}
