package com.meituan.stolencard.stolencard;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.apache.spark.SparkConf;
import org.apache.spark.SparkContext;
import org.apache.spark.sql.DataFrame;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.hive.HiveContext;

import com.google.gson.Gson;
import com.meituan.stolencard.stolencard.entity.QuickSignPayFactor;
import com.meituan.stolencard.stolencard.service.QuickPayService;

public class ObtainSourceData {
    protected static Logger logger=Logger.getLogger(ObtainSourceData.class);
    private final static QuickPayService quickPayService = QuickPayService.getInstance();
    private static Gson gson = new Gson();
    
    public static List<QuickSignPayFactor> getDataFromRiskLog() {
        List<QuickSignPayFactor> riskLogEntities = new ArrayList<QuickSignPayFactor>();
        
        SparkContext sc = new SparkContext(new SparkConf());

        HiveContext hiveContext = new HiveContext(sc);
        String sqlStr = "";
        try {
            sqlStr = quickPayService.getSampleSqlStr();
            sqlStr = "select dt,userid,action,uuid from ba_rc.web_rc_risklog where dt = 20160725 limit 1000";
        } catch (Exception e) {
            // TODO: handle exception
            logger.info("by sql,e"+e.getMessage(),e);
            return null;
        }
        
        if (StringUtils.isEmpty(sqlStr)) {
            return null;
        }

        DataFrame result = hiveContext.sql(sqlStr);
        Row[] collect = result.collect();
        for (Row row : collect) {
            System.out.println(row.get(0) + "\t" + row.get(1) + "\t" + row.get(2));
            logger.info(row);
        }
        
        return null;
    }
}
