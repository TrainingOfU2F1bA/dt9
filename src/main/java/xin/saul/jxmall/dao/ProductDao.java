package xin.saul.jxmall.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xin.saul.jxmall.entity.Product;

import java.util.List;

@Repository
public interface ProductDao extends JpaRepository<Product,Long> {

    List<Product> findByNameLike(String name);

    List<Product> findByNameLikeAndDescriptionLike(String name, String description);
}
