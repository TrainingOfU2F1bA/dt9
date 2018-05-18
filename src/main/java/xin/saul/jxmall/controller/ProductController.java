package xin.saul.jxmall.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;
import xin.saul.jxmall.entity.Product;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;

@RestController
public class ProductController {

    public static final String PRODUCTS = "products";
    public static final String PRODUCTS_ID = "products/{id}";
    public static final String NAME = "name";
    public static final String DESCRIPTION = "description";

    @PutMapping(PRODUCTS_ID)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void update(@PathVariable Long id,@RequestBody Product product){
    }

    @PostMapping(PRODUCTS)
    public ResponseEntity add(@RequestBody Product product, UriComponentsBuilder builder){
        URI uri = builder.path(PRODUCTS).build().toUri();
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(uri);
        ResponseEntity entity = new ResponseEntity(headers,HttpStatus.CREATED);
        return entity;
    }

    @GetMapping(PRODUCTS)
    public Object findAll(){
        return new ArrayList<Product>(Collections.singleton(new Product()));
    }

    @GetMapping(PRODUCTS_ID)
    public Product find(@PathVariable Long id){
        return new Product();
    }

    @GetMapping(value = PRODUCTS,params = {NAME})
    public Object find(String name){
        return new ArrayList<Product>(Collections.singleton(new Product()));
    }

    @GetMapping(value = PRODUCTS,params = {NAME, DESCRIPTION})
    public Object find(String name,String description){
        return new ArrayList<Product>(Collections.singleton(new Product()));
    }


}
