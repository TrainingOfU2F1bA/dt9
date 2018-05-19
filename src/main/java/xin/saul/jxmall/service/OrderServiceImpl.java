package xin.saul.jxmall.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponentsBuilder;
import xin.saul.jxmall.dao.OrderDao;
import xin.saul.jxmall.entity.Order;

import java.net.URI;
import java.util.List;

@Component
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderDao orderDao;

    @Override
    public ResponseEntity add(String s, List<Order> orders, UriComponentsBuilder builder) {
        URI uri = builder.path(s).build().toUri();
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(uri);
        ResponseEntity entity = new ResponseEntity(headers, HttpStatus.CREATED);
        orderDao.saveAll(orders);
        return entity;
    }

    @Override
    public Object findAll() {
        return orderDao.findAll();
    }

    @Override
    public Order find(Long id) {
        return orderDao.findById(id).orElse(null);
    }

    @Override
    public void paid(Long id) {
        Order order = new Order();
        order.setStatus("paid");
        orderDao.save(order);
    }

    @Override
    public void drawn(Long id) {
        Order order = new Order();
        order.setStatus("drawn");
        orderDao.save(order);
    }

    @Override
    public List<Order> findByuid(Long userId) {
        return orderDao.findByUserId(userId);
    }
}
