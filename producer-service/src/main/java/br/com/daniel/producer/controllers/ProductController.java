package br.com.daniel.producer.controllers;

import br.com.daniel.producer.services.ProductService;
import dtos.ProductDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService service;

    @PostMapping
    public ResponseEntity<ProductDTO> produces(@RequestBody ProductDTO productDTO) {
        service.createProduct(productDTO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
