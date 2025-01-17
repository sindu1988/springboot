package com.ECOM.POC.Service;

import com.ECOM.POC.Model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ProductService implements ProductServiceImpl {

    private final List<Product> products = new ArrayList<>();

    @Override
    public List<Product> getAllProducts() {
        return products;
    }

    @Override
    public Product addProduct(Product product) {
        products.add(product);
        return product;
    }

    @Override
    public boolean deleteProduct(Long productId) {
        return products.removeIf(product -> product.getProductId().equals(productId));
    }
}
