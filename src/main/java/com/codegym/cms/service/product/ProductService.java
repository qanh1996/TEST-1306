package com.codegym.cms.service.product;

import com.codegym.cms.model.Category;
import com.codegym.cms.model.Product;
import com.codegym.cms.repository.IProducRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProducRepository producRepository;

    @Override
    public Iterable<Product> findAll() {
        return producRepository.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return producRepository.findById(id);
    }

    @Override
    public void save(Product product) {
        producRepository.save(product);
    }

    @Override
    public void remove(Long id) {
        producRepository.deleteById(id);
    }

    @Override
    public Iterable<Product> findAllByCategory(Category category) {
        return producRepository.findAllByCategory(category);
    }

    @Override
    public Iterable<Product> findAllByNameContaining(String name) {
        return producRepository.findAllByNameContaining(name);
    }

    @Override
    public Iterable<Product> findByName(String name) {
        return producRepository.findByName(name);
    }
}
