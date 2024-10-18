package com.example.webecom.services.auth;
import com.example.webecom.dto.ProductDto;
import com.example.webecom.entity.Product;
import com.example.webecom.repository.ProductRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProducService {
    private final ProductRepository productRepository;

    public ResponseEntity<?> showAllProduct(){
        List<Product> products = productRepository.findAll();
        if(products.isEmpty())
            return new ResponseEntity<>("No Person Found", HttpStatus.NOT_FOUND);
        return ResponseEntity.ok(products);
    }

    public ResponseEntity<?> showProductById(Long id){
        Optional<Product> product = productRepository.findById(id);
        if(product.isEmpty())
            return new ResponseEntity<>("No Product Found", HttpStatus.NOT_FOUND);
        return ResponseEntity.ok(product);
    }

    public ResponseEntity<?> addProduct(ProductDto productDto){
            Product product = new Product();
            product.setName(productDto.getName());
            product.setPrice(productDto.getPrice());
            product.setOld_price(productDto.getOld_price());
            product.setFile_pic(productDto.getFile_pic());
            product.setQuantity(productDto.getQuantity());
            product.setDescription(productDto.getDescription());
            productRepository.save(product);
            return ResponseEntity.ok("Them san pham thanh cong");
    }

    public ResponseEntity<?> deleteProduct(Long id){
        Optional<Product> product = productRepository.findById(id);
        if(product.isEmpty()){ return new ResponseEntity<>("No Product Found", HttpStatus.NOT_FOUND); }
        product.ifPresent(productRepository::delete);
        return ResponseEntity.ok("Xoa san pham thanh cong");

    }

    public ResponseEntity<?> updateProduct(Long id, ProductDto productDto){
        Optional<Product> product = productRepository.findById(id);
        if(product.isEmpty()){ return new ResponseEntity<>("No Product Found", HttpStatus.NOT_FOUND); }
        product.get().setName(productDto.getName());
        product.get().setPrice(productDto.getPrice());
        product.get().setOld_price(productDto.getOld_price());
        product.get().setFile_pic(productDto.getFile_pic());
        product.get().setQuantity(productDto.getQuantity());
        product.get().setDescription(productDto.getDescription());
        productRepository.save(product.get());
        return ResponseEntity.ok("Sua san pham thanh cong");
    }


}
