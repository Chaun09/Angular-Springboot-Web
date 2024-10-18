package com.example.webecom.controller;
import com.example.webecom.dto.ProductDto;
import com.example.webecom.services.auth.ProducService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/{api_prefix}")
@RequiredArgsConstructor
public class ProductController {

    private final ProducService producService;

    @GetMapping("/show_all_product")
    public ResponseEntity<?> showAllProduct(){
        return producService.showAllProduct();
    }
    @GetMapping("/show_product_by_id/{id}")
    public ResponseEntity<?> showProduct(@PathVariable Long id){
        return producService.showProductById(id);

    }
    @PostMapping("/add_product")
    public ResponseEntity<?> addProduct(@RequestBody ProductDto productDto){
        return producService.addProduct(productDto);

    }
    @DeleteMapping("/delete_product/{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable Long id){
        return producService.deleteProduct(id);

    }

    @PutMapping("/update_product/{id}")
    public ResponseEntity<?> updateProduct(@PathVariable Long id, @RequestBody ProductDto productDto){
        return producService.updateProduct(id, productDto);
    }
}
