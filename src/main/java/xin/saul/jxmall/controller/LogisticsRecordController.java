package xin.saul.jxmall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import xin.saul.jxmall.entity.LogisticsRecord;
import xin.saul.jxmall.service.LogisticsRecordService;

@RestController
public class LogisticsRecordController {

    public static final String LOGISTICS_RECORD_ID = "logisticsRecords/{id}";
    public static final String LOGISTICS_RECORDS_ID_ORDERS_ORDER_ID = "logisticsRecords/{id}/orders/{orderId}";
    public static final String LOGISTICS_STATUS_SHIPPING = "logisticsStatus=shipping";
    public static final String LOGISTICS_STATUS_SIGNED = "logisticsStatus=signed";
    @Autowired
    private LogisticsRecordService recordService;

    @GetMapping(LOGISTICS_RECORD_ID)
    public LogisticsRecord find(@PathVariable Long id) {
        System.out.println(id);
        return recordService.find(id);
    }


    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    @PutMapping(value = LOGISTICS_RECORDS_ID_ORDERS_ORDER_ID, params = LOGISTICS_STATUS_SHIPPING)
    public void shipping(@PathVariable Long id, @PathVariable Long orderId) {
        recordService.shipping(id,orderId);
    }

    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    @PutMapping(value = LOGISTICS_RECORDS_ID_ORDERS_ORDER_ID, params = LOGISTICS_STATUS_SIGNED)
    public void signed(@PathVariable Long id, @PathVariable Long orderId) {
        recordService.signed(id,orderId);
    }
}
