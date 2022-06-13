package com.codegym.cms.repository;

import com.codegym.cms.model.Category;
import com.codegym.cms.model.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProducRepository extends PagingAndSortingRepository<Product,Long> {
    Iterable<Product> findAllByCategory(Category category);
    Iterable<Product> findAllByNameContaining(String name);
    Iterable<Product> findByName(String name);
    Iterable<Product> findAllByOrderByPrice();
    Iterable<Product> findAllByPriceBetween(double from,double to);
    @Query(value = "select * from products order by id desc LIMIT 4", nativeQuery = true)
    Iterable<Product> getTop4();

}
