package xin.saul.jxmall.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xin.saul.jxmall.entity.Account;

@Repository
public interface AccountDao extends JpaRepository<Account,Long> {

}
