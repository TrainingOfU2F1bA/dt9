package xin.saul.jxmall.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import xin.saul.jxmall.dao.LogisticsRecordDao;
import xin.saul.jxmall.entity.LogisticsRecord;
@Component
public class LogisticsRecordServiceImpl implements LogisticsRecordService{
    @Autowired
    LogisticsRecordDao recordDao;
    @Override
    public LogisticsRecord find(Long id) {
        return recordDao.findById(id).orElse(null);
    }

    @Override
    public void shipping(Long id, Long orderId) {
        LogisticsRecord logisticsRecord = new LogisticsRecord();
        logisticsRecord.setId(id);
        logisticsRecord.setLogisticsStatus("shipping");
        recordDao.save(logisticsRecord);
    }

    @Override
    public void signed(Long id, Long orderId) {
        LogisticsRecord logisticsRecord = new LogisticsRecord();
        logisticsRecord.setId(id);
        logisticsRecord.setLogisticsStatus("signed");
        recordDao.save(logisticsRecord);
    }
}
