package xin.saul.jxmall.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xin.saul.jxmall.entity.User;

import javax.persistence.*;

@Repository
public interface UserDao extends JpaRepository<User,Long> {

}
