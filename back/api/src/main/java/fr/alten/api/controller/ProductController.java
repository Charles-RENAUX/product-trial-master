package fr.alten.api.controller;

import fr.alten.api.model.Product;
import fr.alten.api.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getAllProducts(){
        return productService.getAllProduct();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Long id){
        Optional<Product> productOptional = productService.getProductById(id);
        return productOptional.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
        return ResponseEntity.noContent().build();
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Void> updateProduct(@PathVariable Long id,@RequestBody Product product){
        productService.updateProduct(id,product);
        return ResponseEntity.noContent().build();
    }

    @PostMapping
    public Product product(@RequestBody Product product) {
        return productService.createNewProduct(product);
    }
}
