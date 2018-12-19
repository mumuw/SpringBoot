package com.lin.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@ComponentScan("com.lin.el")

@PropertySource(value ={"classpath:el.properties"},ignoreResourceNotFound = false,encoding = "UTF-8",name = "el.properties")
@ConfigurationProperties(prefix = "el",ignoreInvalidFields = true,ignoreUnknownFields = true)
public class ElConfig {

    private String author = null;
    private String name = null;
    private String type = null;
    private String type2 = null;

    public String getType2() {
        return type2;
    }

    public void setType2(String type2) {
        this.type2 = type2;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
