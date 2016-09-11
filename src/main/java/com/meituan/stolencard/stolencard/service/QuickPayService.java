package com.meituan.stolencard.stolencard.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.meituan.rc.prophet.client.service.user.UserClient;
import com.meituan.stolencard.stolencard.dao.RiskLogMapper;
import com.meituan.stolencard.stolencard.dao.StealCardSampleMapper;

public class QuickPayService {
    private volatile static QuickPayService singleton;
    private ApplicationContext applicationContext;
    
    private QuickPayService(){
    }
    
    public static QuickPayService getInstance(){
        if(singleton==null){
            synchronized(QuickPayService.class){
                if(singleton == null){
                    singleton = new QuickPayService();
                    singleton.setApplicationContext(new ClassPathXmlApplicationContext("classpath*:ApplicationContext.xml"));
                }
            }
        }
        
        return singleton;
    }
    
    
    private void setApplicationContext(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }


    public String getSampleSqlStr() {
        
        RiskLogMapper riskLogMapper = (RiskLogMapper) applicationContext.getBean("getUseridUuidByDt");
        
        String sqlStr = riskLogMapper.getSqlOnDataFromRiskLog();
        System.out.println(sqlStr);
        return sqlStr;
    }
    
    public UserClient getUserClientInstance() {
        UserClient userClient = (UserClient) applicationContext.getBean("userClient");
        
        return userClient;
    }
}
