package com.codegym.cms.service.product;

import com.codegym.cms.model.Category;
import com.codegym.cms.model.Product;
import com.codegym.cms.service.IGeneralService;

public interface IProductService extends IGeneralService<Product> {
    Iterable<Product> findAllByCategory(Category category);
}
