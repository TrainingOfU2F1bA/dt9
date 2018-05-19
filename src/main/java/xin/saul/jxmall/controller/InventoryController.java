package xin.saul.jxmall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import xin.saul.jxmall.entity.Inventory;
import xin.saul.jxmall.service.InventoryService;

@RestController
public class InventoryController {

    public static final String INVENTORIES_ID = "inventories/{id}";
    @Autowired
    private InventoryService inventoryService;

    @PutMapping(INVENTORIES_ID)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void changeCount(@PathVariable Long id,Inventory inventory){
        inventoryService.changeCount(id,inventory);
    }
}
