package org.junit.cdiunit;

import javax.ejb.Singleton;

/**
 * Implementation of the ejb bean
 */
@Singleton
public class MyBeanImpl implements MyBean {

    @Override
    public String doSomething(String test) {
        return test;
    }
}
