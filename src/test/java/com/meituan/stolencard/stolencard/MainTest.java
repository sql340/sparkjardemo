package com.meituan.stolencard.stolencard;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.meituan.rc.prophet.client.service.user.UserClient;
import com.meituan.rc.prophet.client.service.user.bo.UserAttrEnum;
import com.meituan.stolencard.stolencard.dao.RiskLogMapper;
import com.meituan.stolencard.stolencard.service.RiskLogService;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class MainTest extends TestCase {
    @Autowired
    private UserClient userClient;
    protected Logger logger=Logger.getLogger(MainTest.class);
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public MainTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( MainTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        ApplicationContext bf = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        System.out.println(bf.toString());
        RiskLogMapper uc = (RiskLogMapper) bf.getBean("getUseridUuidByDt");
//        Object object = uc.getUserInfo(13718522980L, UserAttrEnum.ID);
        
        System.out.println("***********************");
        System.out.println("Hello");
        System.out.println("***********************");
    }
}
