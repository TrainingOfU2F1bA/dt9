package xin.saul.jxmall.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.util.UriComponentsBuilder;
import xin.saul.jxmall.entity.Product;

public interface ProductService  {

    void update(Long id, Product product);

    ResponseEntity add(String products, Product product, UriComponentsBuilder builder);

    Object findAll();

    Product find(Long id);

    Object find(String name);

    Object find(String name, String description);
}
