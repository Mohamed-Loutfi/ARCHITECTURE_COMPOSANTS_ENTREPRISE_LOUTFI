package ma.formations.rest.service;

import java.util.*;
import org.springframework.stereotype.Service;
import ma.formations.rest.service.model.Product;

@Service
public class ProductServiceImpl implements IProductService {

    private static final List<Product> productRepo = new ArrayList<>();

    static {
        productRepo.add(new Product(1L, "PC PORTABLE HP"));
        productRepo.add(new Product(2L, "TV LG 32p"));
        productRepo.add(new Product(3L, "TV Sony 49p"));
        productRepo.add(new Product(4L, "Camera Sony"));
    }

    @Override
    public Product getById(Long id) {
        if (productRepo == null || productRepo.isEmpty())
            return null;
        for (Product product : productRepo) {
            if (id.equals(product.getId()))
                return product;
        }
        return null;
    }

    @Override
    public List<Product> getAll() {
        return productRepo;
    }

    @Override
    public void update(Long id, Product product) {
        Product productFound = getById(id);
        if (productFound == null)
            return;
        productRepo.remove(productFound);
        product.setId(id);
        productRepo.add(product);
    }

    @Override
    public void delete(Long id) {
        Product productFound = getById(id);
        if (productFound == null)
            return;
        productRepo.remove(productFound);
    }

    @Override
    public void create(Product product) {
        productRepo.add(product);
    }
}

