package xin.saul.jxmall.service;

import xin.saul.jxmall.entity.LogisticsRecord;

public interface LogisticsRecordService  {
    LogisticsRecord find(Long id);
    void shipping(Long id, Long orderId);
    void signed(Long id, Long orderId);
}
