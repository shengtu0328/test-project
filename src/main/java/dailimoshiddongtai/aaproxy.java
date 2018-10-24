package dailimoshiddongtai;

import dalimoshi.aa;
import dalimoshi.interface11;

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
        interface11 interface11 = new aa();
        InvocationHandler handler = new aaproxy(interface11);
        interface11 bp = (interface11) Proxy.newProxyInstance(interface11.getClass().getClassLoader(), interface11.getClass().getInterfaces(), handler);
        bp.o();
        bp.o2();

    }
}
