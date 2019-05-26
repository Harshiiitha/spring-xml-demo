package com.stackroute;

import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ResourceLoaderAwareDemo implements ResourceLoaderAware {

    private ResourceLoader resourceLoader;

    public void setResourceLoader(ResourceLoader resourceLoader) {


        Resource resource = resourceLoader.getResource("Data");

        InputStream in = null;
        try {

            in = resource.getInputStream();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));

        while (true) {
            String text = null;
            try {
                text = bufferedReader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (text == null)
                break;
            System.out.println(text+"\n");
        }
        try {
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
