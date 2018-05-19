package xin.saul.jxmall.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xin.saul.jxmall.entity.Product;

@Repository
public interface ProductDao extends JpaRepository<Product,Long> {

    Object findByNameLike(String name);

    Object findByNameLikeAndDescriptionLike(String name, String description);
}
