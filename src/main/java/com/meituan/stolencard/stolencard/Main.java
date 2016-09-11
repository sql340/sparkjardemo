package com.meituan.stolencard.stolencard;


import java.util.List;


import org.apache.log4j.Logger;

import com.meituan.stolencard.stolencard.entity.QuickSignPayFactor;

/**
 * 获取数据
 */
public class Main 
{   
    protected static Logger logger=Logger.getLogger(Main.class);
    public static void main(String[] args) {
        List<QuickSignPayFactor> targetTableEntities = ObtainSourceData.getDataFromRiskLog();
        
        if (targetTableEntities == null) {
            return;
        }
        
        for (QuickSignPayFactor targetTableEntity : targetTableEntities) {
            System.out.println(targetTableEntity.toString());
        }
        
    }
    
}
