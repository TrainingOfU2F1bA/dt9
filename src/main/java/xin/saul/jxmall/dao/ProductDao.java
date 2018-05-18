package xin.saul.jxmall.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xin.saul.jxmall.entity.Inventory;
import xin.saul.jxmall.entity.Product;

import javax.persistence.*;

@Repository
public interface ProductDao extends JpaRepository<Product,Long> {

}
