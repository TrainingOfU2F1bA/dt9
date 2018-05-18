package xin.saul.jxmall.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;
import xin.saul.jxmall.entity.Order;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
public class OrderController {

    public static final String ORDERS = "orders";
    public static final String ORDERS_ID = "orders/{id}";
    public static final String ORDER_STATUS_PAID = "orderStatus=paid";
    public static final String ORDER_STATUS_WITHDRAWN = "orderStatus=withdrawn";

    @PostMapping(ORDERS)
    public ResponseEntity add(@RequestBody List<Order> order, UriComponentsBuilder builder){
        URI uri = builder.path(ORDERS).build().toUri();
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(uri);
        ResponseEntity entity = new ResponseEntity(headers,HttpStatus.CREATED);
        return entity;
    }

    @GetMapping(ORDERS)
    public Object findAll(){
        return new ArrayList<Order>(Collections.singleton(new Order()));
    }

    @GetMapping(ORDERS_ID)
    public Order find(@PathVariable Long id){
        return new Order();
    }

    @PutMapping(value = ORDERS_ID,params = {ORDER_STATUS_PAID})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void paid(@PathVariable Long id){
        System.out.println("paid");
    }

    @PutMapping(value = ORDERS_ID,params = {ORDER_STATUS_WITHDRAWN})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void drawn(@PathVariable Long id){
        System.out.println("drawn");
    }

    @GetMapping(value = ORDERS,params = {"userId"})
    public List<Order> findByuid(Long userId){
        return new ArrayList<Order>(Collections.singleton(new Order()));
    }
}
