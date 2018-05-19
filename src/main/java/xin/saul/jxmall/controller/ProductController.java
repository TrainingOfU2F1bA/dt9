package xin.saul.jxmall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;
import xin.saul.jxmall.entity.Product;
import xin.saul.jxmall.service.ProductService;

@RestController
public class ProductController {

    public static final String PRODUCTS = "products";
    public static final String PRODUCTS_ID = "products/{id}";
    public static final String NAME = "name";
    public static final String DESCRIPTION = "description";
    @Autowired
    private ProductService productService;

    @PutMapping(PRODUCTS_ID)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void update(@PathVariable Long id,@RequestBody Product product){
        productService.update(id,product);
    }

    @PostMapping(PRODUCTS)
    public ResponseEntity add(@RequestBody Product product, UriComponentsBuilder builder){
        return productService.add(PRODUCTS,product,builder);
    }

    @GetMapping(PRODUCTS)
    public Object findAll(){
       return productService.findAll();
    }

    @GetMapping(PRODUCTS_ID)
    public Product find(@PathVariable Long id){
        return productService.find(id);
    }

    @GetMapping(value = PRODUCTS,params = {NAME})
    public Object find(String name){
        return productService.find(name);
    }

    @GetMapping(value = PRODUCTS,params = {NAME, DESCRIPTION})
    public Object find(String name,String description){
        return productService.find(name,description);
    }


}
