package org.gabriel.simpleWebApp.repository;

import org.gabriel.simpleWebApp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    // Ao extender JPARepository, recebo todos os métodoos definidos na hierarquia das interfaces
    // O spring Data gera automaticamente as implementações em tempo de execução
    // O Hibernate é o provedor que faz o trabalho pesado

    // CrudRepository - Interface básica como próprio nome diz oferece apenas as operações CRUD simples
    // JPARepository - Extends de CrudRepository e, oferece funcionalidades adicionais específicas do JPA



    // Consultas baseadas no nome do métodoo como funcionam:
    // Spring Data JPA segue uma convenção de nomenclatura com base no nome dos métodos
    // A ideia é que o nome do métodoo descreva a lógica da consulta
    // Permitindo que o Spring interprete gere a consulta JPQL correspondente

    // Case-sensitive

    // Prefixo de consulta - define o tipo de operação
    // findBy - readBy- queryBy - getBy - countBy - deleteBy

    // Propriedade da entidade - indica o campo a ser consultado
    // E.g. LastName, Age

    // Palavras-chave opcionais - definem condições adicionais
    // E.g. And, Or, Between, LessThan, Like


    // Exemplosss

    // Consulta básica
    // JPQL gera: SELECT p FROM Product p WHERE p.prodBranding = :branding
    List<Product> findByProdBranding(String Branding);


}
