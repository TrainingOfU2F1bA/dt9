package xin.saul.jxmall.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xin.saul.jxmall.entity.Order;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Repository
public interface OrderDao extends JpaRepository<Order,Long> {

}
