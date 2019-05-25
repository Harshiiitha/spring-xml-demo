package com.stackroute;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {

        @Deprecated
        public static void main(String[] args)
        {

            //Using Application context
            ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
            Movie movie= (Movie)context.getBean("movie1");
            System.out.println(movie);

            //Using XmlBeanFactory
            BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("beans.xml"));
            Movie movie1=(Movie)beanFactory.getBean("movie2");
            System.out.println(movie1);

            //Using BeanDefinitionRegistry and BeanDefinitionReader

            BeanDefinitionRegistry beanDefinitionRegistry = new DefaultListableBeanFactory();
            BeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanDefinitionRegistry);
            beanDefinitionReader.loadBeanDefinitions(new ClassPathResource("beans.xml"));
            Movie movie2=(Movie) ((DefaultListableBeanFactory) beanDefinitionRegistry).getBean("movie3");
            System.out.println(movie2);




        }
    }

