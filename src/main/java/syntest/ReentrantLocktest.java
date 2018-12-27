package syntest;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @program: test-project
 * @author: rqxiao
 * @create: 2018-12-27 17:08
 **/
public class ReentrantLocktest {


    Lock lock=new ReentrantLock();


    public synchronized void method1(){
        System.out.println("进入syn锁");
    }

    public void method2(){
        lock.lock();
        try{
            System.out.println("进入lock锁");
        }finally {
            lock.unlock();
        }
    }


    public static void main(String[] args) {
        ReentrantLocktest reentrantLocktest=new ReentrantLocktest();
        reentrantLocktest.method1();
        reentrantLocktest.method2();

    }
}
