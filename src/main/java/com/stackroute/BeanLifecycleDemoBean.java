package com.stackroute;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {

    @Override
    public void afterPropertiesSet() throws Exception {

        System.out.println("Initializing");

    }

    @Override
    public void destroy() throws Exception {

        System.out.println("Destroying");

    }

    public void customInit()
    {
        System.out.println("Method customInit() invoked...");
    }

    public void customDestroy()
    {
        System.out.println("Method customDestroy() invoked...");
    }
}
