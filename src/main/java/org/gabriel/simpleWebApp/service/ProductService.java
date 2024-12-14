package org.gabriel.simpleWebApp.service;

import org.gabriel.simpleWebApp.model.Product;
import org.gabriel.simpleWebApp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;



    public List<Product> getProducts(){
        return productRepository.findAll();
    }


    public Product getProductById(Integer prodId){
        return productRepository.findById(prodId).orElse(new Product());
    }

    public List<Product> getProductByBranding(String branding) {
        return productRepository.findByProdBranding(branding);
    }


    public void addProduct(Product product){
        productRepository.save(product);

    }


    public void updateProduct(Product product){
        productRepository.save(product); // gambiarra
    }


   public void deleteProduct(Integer prodId){
        productRepository.deleteById(prodId);

   }


}
