package xin.saul.jxmall.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xin.saul.jxmall.entity.PurchaseItem;

@Repository
public interface PurchaseItemDao extends JpaRepository<PurchaseItem,Long> {

}
