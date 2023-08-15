package dailimoshiddongtai;

import dalimoshi.A;
import dalimoshi.aa;
import dalimoshi.jiekou1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class aaproxy implements InvocationHandler {

    private Object obj;

    aaproxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理前");

        method.invoke(obj, args);

        System.out.println("代理后");

        return null;
    }


    public static void main(String[] args) {
        jiekou1 interface11 = new aa();
        InvocationHandler handler = new aaproxy(interface11);
        jiekou1 bp = (jiekou1) Proxy.newProxyInstance(interface11.getClass().getClassLoader(), interface11.getClass().getInterfaces(), handler);
        bp.o();



        jiekou1 interface12 = new A();
        InvocationHandler handler2 = new aaproxy(interface12);
        jiekou1 bp2 = (jiekou1) Proxy.newProxyInstance(interface12.getClass().getClassLoader(), interface12.getClass().getInterfaces(), handler2);
        bp2.o();

    }
}
