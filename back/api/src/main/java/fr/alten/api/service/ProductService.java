package fr.alten.api.service;

import fr.alten.api.model.Product;
import fr.alten.api.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public Product createNewProduct(Product product){
        return productRepository.save(product);
    }

    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(Long id) {
        return ProductRepository.findById(id);
    }

    public void deleteProduct(Long id) {
        if (productRepository.existsById(id)) {
            productRepository.deleteById(id);
        } else {
            throw new RuntimeException("Product not found with id: " + id);
        }
    }

    public void updateProduct(Long id,Product product) {
        if (productRepository.existsById(id)) {
            productRepository.save(product);
        } else {
            throw new RuntimeException("Product not found with id: " + id);
        }
    }


}
