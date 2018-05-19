package xin.saul.jxmall.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import xin.saul.jxmall.dao.InventoryDao;
import xin.saul.jxmall.entity.Inventory;
@Component
public class InventoryServiceImpl implements InventoryService {
    @Autowired
    private InventoryDao inventoryDao;

    @Override
    public void changeCount(Long id, Inventory inventory) {
        inventory.setId(id);
        inventoryDao.save(inventory);
    }
}
