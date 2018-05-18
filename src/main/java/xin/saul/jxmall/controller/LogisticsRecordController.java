package xin.saul.jxmall.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import xin.saul.jxmall.entity.LogisticsRecord;
import xin.saul.jxmall.entity.Order;

import java.util.ArrayList;
import java.util.Date;

@RestController
public class LogisticsRecordController {

    public static final String LOGISTICS_RECORD_ID = "logisticsRecords/{id}";
    public static final String LOGISTICS_RECORDS_ID_ORDERS_ORDER_ID = "logisticsRecords/{id}/orders/{orderId}";
    public static final String LOGISTICS_STATUS_SHIPPING = "logisticsStatus=shipping";
    public static final String LOGISTICS_STATUS_SIGNED = "logisticsStatus=signed";

    @GetMapping(LOGISTICS_RECORD_ID)
    public LogisticsRecord find(Long id) {
        LogisticsRecord record = new LogisticsRecord();
        record.setOrder(new Order());
        return record;
    }


    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    @PutMapping(value = LOGISTICS_RECORDS_ID_ORDERS_ORDER_ID, params = LOGISTICS_STATUS_SHIPPING)
    public void shipping(@PathVariable Long id, @PathVariable Long orderId) {
        System.out.println("shopping");
    }

    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    @PutMapping(value = LOGISTICS_RECORDS_ID_ORDERS_ORDER_ID, params = LOGISTICS_STATUS_SIGNED)
    public void signed(@PathVariable Long id, @PathVariable Long orderId) {
        System.out.println("signed");
    }
}
