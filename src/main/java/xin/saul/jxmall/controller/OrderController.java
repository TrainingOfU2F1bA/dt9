package xin.saul.jxmall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;
import xin.saul.jxmall.entity.Order;
import xin.saul.jxmall.service.OrderService;

import java.util.List;

@RestController
public class OrderController {

    public static final String ORDERS = "orders";
    public static final String ORDERS_ID = "orders/{id}";
    public static final String ORDER_STATUS_PAID = "orderStatus=paid";
    public static final String ORDER_STATUS_WITHDRAWN = "orderStatus=withdrawn";
    @Autowired
    private OrderService orderService;

    @PostMapping(ORDERS)
    public ResponseEntity add(@RequestBody List<Order> orders, UriComponentsBuilder builder){
       return orderService.add(ORDERS,orders,builder);
    }

    @GetMapping(ORDERS)
    public Object findAll(){
        return orderService.findAll();
    }

    @GetMapping(ORDERS_ID)
    public Order find(@PathVariable Long id){
        return orderService.find(id);
    }

    @PutMapping(value = ORDERS_ID,params = {ORDER_STATUS_PAID})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void paid(@PathVariable Long id){
        orderService.paid(id);
    }

    @PutMapping(value = ORDERS_ID,params = {ORDER_STATUS_WITHDRAWN})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void drawn(@PathVariable Long id){
        orderService.drawn(id);
    }

    @GetMapping(value = ORDERS,params = {"userId"})
    public List<Order> findByuid(Long userId){
        return orderService.findByuid(userId);
    }
}
