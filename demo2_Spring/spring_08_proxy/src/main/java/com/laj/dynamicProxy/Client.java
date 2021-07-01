package com.laj.dynamicProxy;

public class Client {
    public static void main(String[] args) {
        Host host = new Host();
        ProxyInvocationHandle proxyInvocationHandle = new ProxyInvocationHandle();
        proxyInvocationHandle.setRent(host);
        Rent proxy = (Rent) proxyInvocationHandle.getProxy();
        proxy.rent();
    }
}
