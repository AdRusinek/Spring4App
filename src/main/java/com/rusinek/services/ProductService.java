package com.rusinek.services;

import com.rusinek.commands.ProductForm;
import com.rusinek.domain.Product;

import java.util.List;

public interface ProductService extends CRUDService<Product> {

    Product saveOrUpdateProductForm(ProductForm productForm);

}