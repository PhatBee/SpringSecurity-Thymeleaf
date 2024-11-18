package vn.oneshop.springsecuritythymeleaf.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.oneshop.springsecuritythymeleaf.entity.Product;
import vn.oneshop.springsecuritythymeleaf.repository.ProductRepository;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductServices{
    @Autowired
    private ProductRepository repo;

    public ProductServiceImpl(ProductRepository repo) {
        this.repo = repo;
    }
    @Override
    public void delete(long id) {
        repo.deleteById(id);
    }

    @Override
    public Product get(long id) {
        return repo.findById(id).get();
    }

    @Override
    public Product save(Product product) {
        return repo.save(product);
    }

    @Override
    public List<Product> listAll() {
        return repo.findAll();
    }

}
