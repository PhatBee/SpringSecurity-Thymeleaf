package vn.oneshop.springsecuritythymeleaf.Services;

import vn.oneshop.springsecuritythymeleaf.entity.Product;

import java.util.List;

public interface ProductServices {
    void delete(long id);
    Product get(long id);
    Product save(Product product);
    List<Product> listAll();
}
