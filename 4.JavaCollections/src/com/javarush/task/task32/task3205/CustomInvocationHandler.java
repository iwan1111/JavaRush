package com.javarush.task.task32.task3205;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class CustomInvocationHandler implements InvocationHandler {
    private SomeInterfaceWithMethods siwm;

    public CustomInvocationHandler(SomeInterfaceWithMethods siwm){
        this.siwm = siwm;
        return;
    }



    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(method.getName() + " in");
        Object m = method.invoke(siwm, args);
        System.out.println(method.getName() + " out");
        return m;
    }


}
