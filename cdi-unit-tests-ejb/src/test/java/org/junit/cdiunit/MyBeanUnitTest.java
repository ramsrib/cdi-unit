package org.junit.cdiunit;

import org.jglue.cdiunit.AdditionalClasses;
import org.jglue.cdiunit.CdiRunner;
import org.jglue.cdiunit.ejb.SupportEjb;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.ejb.EJB;

/**
 * Unit Test for the EJB singleton bean
 */
@SupportEjb
@RunWith(CdiRunner.class)
@AdditionalClasses(MyBeanImpl.class)
public class MyBeanUnitTest {

    @EJB
    MyBean myBean;

    @Test
    public void testSomething() {
        String test = myBean.doSomething("test");
        Assert.assertEquals(test, "test");
    }
}
