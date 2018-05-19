package xin.saul.jxmall.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.util.UriComponentsBuilder;
import xin.saul.jxmall.entity.Order;

import java.util.List;

public interface OrderService {

    ResponseEntity add(String s, List<Order> orders, UriComponentsBuilder builder);


    Object findAll();

    Order find(Long id);

    void paid(Long id);

    void drawn(Long id);

    List<Order> findByuid(Long userId);
}
