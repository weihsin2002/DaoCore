package org.dao.core.test;

import org.apache.log4j.Logger;

public class Test {
	private static final Logger logger = Logger.getLogger(Test.class);
	
	public enum UserStatus {
	    PENDING,
	    ACTIVE,
	    INACTIVE,
	    DELETED;
	}
	
    public static void main(String[] args) {

        logger.info("ACTIVE=" + UserStatus.ACTIVE);

    }
}
