package org.gabriel.simpleWebApp.configuration;

import org.gabriel.simpleWebApp.model.Product;
import org.gabriel.simpleWebApp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataSedeer implements CommandLineRunner {

    /* CommandLineRunner - Usada para executar código assim que a aplicação Spring Boot é completamente carregada,
    mas antes de começar a responder requisições HTTP. (caso seja uma app web)*/

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {

        productRepository.save(new Product(101, "Iphone 15", 10000.0, "Apple"));
        productRepository.save(new Product(102, "Mouse", 89.90, "Logitech"));
        productRepository.save(new Product(103, "Laptop", 5000.0, "Acer"));
        productRepository.save(new Product(104, "Tablet", 2000.0, "Samsung"));
        productRepository.save(new Product(105, "Iphone 14", 10000.0, "Apple"));
        productRepository.save(new Product(106, "Macbook", 14000.0, "Apple"));
        productRepository.save(new Product(107, "Galaxy S23", 4000.0, "Samsung"));
        productRepository.save(new Product(108, "Galaxy S24", 6000.0, "Samsung"));
        productRepository.save(new Product(109, "Desktop", 5999.0, "Dell"));



        System.out.println("Data seeding complete");

    }
}
