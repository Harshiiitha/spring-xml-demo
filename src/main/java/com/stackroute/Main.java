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


            //Checking singleton scope
            Movie movie3= (Movie)context.getBean("movie1");
            System.out.print("Singleton scope : ");
            System.out.println(movie==movie3);

            //Getting beanobject by name
            Movie movie4= (Movie)context.getBean("MovieA");
            System.out.println("Using name attribute");
            System.out.println(movie4);


            //Getting beanobject by name
            Movie movie5= (Movie)context.getBean("MovieB");
            System.out.println("Using name attribute");
            System.out.println(movie5);


            //Using XmlBeanFactory
            BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("beans.xml"));
            Movie movie1=(Movie)beanFactory.getBean("movie2");
            System.out.println(movie1);



            //checking prototype scope
            Movie movie6=(Movie)beanFactory.getBean("movie2");
            System.out.print("Prototype scope :");
            System.out.println(movie1==movie6);


            //Using BeanDefinitionRegistry and BeanDefinitionReader

            BeanDefinitionRegistry beanDefinitionRegistry = new DefaultListableBeanFactory();
            BeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanDefinitionRegistry);
            beanDefinitionReader.loadBeanDefinitions(new ClassPathResource("beans.xml"));
            Movie movie2=(Movie) ((DefaultListableBeanFactory) beanDefinitionRegistry).getBean("movie3");
            System.out.println(movie2);




        }
    }

