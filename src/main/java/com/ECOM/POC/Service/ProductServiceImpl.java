package com.ECOM.POC.Service;
import com.ECOM.POC.Model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public interface ProductServiceImpl {
     List<Product> getAllProducts();
     Product addProduct(Product product);
     boolean deleteProduct(Long productId);
}
