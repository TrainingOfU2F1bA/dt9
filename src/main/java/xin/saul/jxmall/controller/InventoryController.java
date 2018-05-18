package xin.saul.jxmall.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import xin.saul.jxmall.entity.Inventory;
import xin.saul.jxmall.entity.LogisticsRecord;

@RestController
public class InventoryController {

    public static final String INVENTORIES_ID = "inventories/{id}";

    @PutMapping(INVENTORIES_ID)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void changeCount(@PathVariable Long id,Inventory inventory){

    }
}
