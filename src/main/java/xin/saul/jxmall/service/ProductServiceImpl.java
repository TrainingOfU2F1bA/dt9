package xin.saul.jxmall.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponentsBuilder;
import xin.saul.jxmall.dao.ProductDao;
import xin.saul.jxmall.entity.Product;
import java.net.URI;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public void update(Long id, Product product) {
        product.setId(id);
        productDao.save(product);
    }

    @Override
    public ResponseEntity add(String products, Product product, UriComponentsBuilder builder) {
        productDao.save(product);
        URI uri = builder.path(products).build().toUri();
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(uri);
        ResponseEntity entity = new ResponseEntity(headers, HttpStatus.CREATED);
        return entity;
    }

    @Override
    public Object findAll() {
        return productDao.findAll();
    }

    @Override
    public Product find(Long id) {
        return productDao.findById(id).orElse(null);
    }

    @Override
    public Object find(String name) {
        return productDao.findByNameLike(name);
    }

    @Override
    public Object find(String name, String description) {
        return productDao.findByNameLikeAndDescriptionLike("%"+name+"%", "%"+description+"%");
    }
}
