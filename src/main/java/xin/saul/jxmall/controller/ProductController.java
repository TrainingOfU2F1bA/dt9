package xin.saul.jxmall.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController(ProductController.PRODUCTS)
public class ProductController {

    public static final String PRODUCTS = "products";

   @GetMapping("products/{id}")
    public String find(@PathVariable Long id){
        return id.toString();
    }
}
