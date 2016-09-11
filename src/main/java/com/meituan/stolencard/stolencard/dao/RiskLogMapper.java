package com.meituan.stolencard.stolencard.dao;

import org.springframework.stereotype.Service;


@Service
public class RiskLogMapper {
    private String sqlOnDataFromRiskLog;
    private String sqlOnSumMoneyByUserid;
    
    public String getSqlOnDataFromRiskLog() {
        return sqlOnDataFromRiskLog;
    }
    public void setSqlOnDataFromRiskLog(String sqlOnDataFromRiskLog) {
        this.sqlOnDataFromRiskLog = sqlOnDataFromRiskLog;
    }
    public String getSqlOnSumMoneyByUserid() {
        return sqlOnSumMoneyByUserid;
    }
    public void setSqlOnSumMoneyByUserid(String sqlOnSumMoneyByUserid) {
        this.sqlOnSumMoneyByUserid = sqlOnSumMoneyByUserid;
    }
    
}
