package com.yoe.server.mediator;

import java.lang.reflect.Method;

public class BeanMethod {

    private Object bean;

    private Method method;

    public BeanMethod() {
    }

    public BeanMethod(Object bean, Method method) {
        this.bean = bean;
        this.method = method;
    }

    public Object getBean() {
        return bean;
    }

    public void setBean(Object bean) {
        this.bean = bean;
    }

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method method) {
        this.method = method;
    }
}
