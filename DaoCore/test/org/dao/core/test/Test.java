package org.dao.core.test;

import org.apache.log4j.Logger;
import org.dao.core.HeavenlyStems;

public class Test {
	private static final Logger logger = Logger.getLogger(Test.class);
		
    public static void main(String[] args) {

    	String value = HeavenlyStems.valueOf("BING").name();
    	int order = HeavenlyStems.valueOf("BING").order();
    	
        logger.info("value=" + value);
        logger.info("order=" + order);
        
        String name = HeavenlyStems.fromOrder(1);
        logger.info("name=" + name);

    }
}
