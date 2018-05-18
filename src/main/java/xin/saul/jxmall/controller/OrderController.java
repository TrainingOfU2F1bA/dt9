package xin.saul.jxmall.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import xin.saul.jxmall.entity.Order;

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
    @ResponseStatus(HttpStatus.CREATED)
    public void add(@RequestBody List<Order> order){
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

    @GetMapping(value = ORDERS_ID,params = {"userId"})
    public void findByuid(@PathVariable Long userId){
        System.out.println("userId");
    }
}
