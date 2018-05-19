package xin.saul.jxmall.service;

import xin.saul.jxmall.entity.Inventory;

public interface InventoryService  {
    void changeCount(Long id, Inventory inventory);
}
