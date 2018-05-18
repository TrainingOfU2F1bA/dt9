package xin.saul.jxmall.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xin.saul.jxmall.entity.LogisticsRecord;

import javax.persistence.*;
import java.util.Date;

@Repository
public interface LogisticsRecordDao extends JpaRepository<LogisticsRecord,Long> {

}
