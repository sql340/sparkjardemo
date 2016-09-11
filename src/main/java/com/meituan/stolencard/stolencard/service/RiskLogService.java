package com.meituan.stolencard.stolencard.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.meituan.rc.prophet.client.service.user.UserClient;
import com.meituan.stolencard.stolencard.dao.RiskLogMapper;

/**
 * 单例
 */
public class RiskLogService {
    private volatile static RiskLogService singleton;
    private ApplicationContext applicationContext;
    
    private RiskLogService(){
    }
    
    public static RiskLogService getInstance(){
        if(singleton==null){
            synchronized(RiskLogService.class){
                if(singleton == null){
                    singleton = new RiskLogService();
                    singleton.setApplicationContext(new ClassPathXmlApplicationContext("classpath*:ApplicationContext.xml"));
                }
            }
        }
        
        return singleton;
    }
    
    
    private void setApplicationContext(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }


    public String getUseridUuidSqlStr() {
        
        RiskLogMapper riskLogMapper = (RiskLogMapper) applicationContext.getBean("getUseridUuidByDt");
        
        String sqlStr = riskLogMapper.getSqlOnDataFromRiskLog();
        
        return sqlStr;
    }
    
    public UserClient getUserClientInstance() {
        UserClient userClient = (UserClient) applicationContext.getBean("userClient");
        
        return userClient;
    }
}
