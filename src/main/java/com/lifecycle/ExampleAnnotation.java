package com.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ExampleAnnotation {

    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public ExampleAnnotation() {
        super();
    }

    @Override
    public String toString() {
        return "ExampleAnnotation [subject=" + subject + "]";
    }
    @PostConstruct
    public void init() {
        System.out.println("===========================Init method called for ExampleAnnotation==========================");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("==================Destroy method called for ExampleAnnotation========================");
    }
}
