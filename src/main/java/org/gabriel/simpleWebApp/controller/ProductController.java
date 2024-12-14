package org.gabriel.simpleWebApp.controller;


import org.gabriel.simpleWebApp.model.Product;
import org.gabriel.simpleWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/products", method = RequestMethod.GET) // Get é default (para fins de conhecimento)
    public List<Product> getProducts(){
        return productService.getProducts();  // jackson converte de Objeto para JSON, vice versa
    }

    @GetMapping("/products/{prodId}")
    public Product getProductById(@PathVariable int prodId){ // Extrai os valores diretamente da URL
        return productService.getProductById(prodId);
    }


    @GetMapping("/products/branding/{branding}")
    public List<Product> getProductsByBranding(@PathVariable String branding){
        return productService.getProductByBranding(branding);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product product){ // Extrai os valores do corpo da requisição
        productService.addProduct(product);
    }

    @PutMapping("/products")
    public void updateProduct(@RequestBody Product product){
        productService.updateProduct(product);
    }

    @DeleteMapping("/products/{prodId}")
    public void deleteProduct(@PathVariable int prodId) {
        productService.deleteProduct(prodId);
    }
}
