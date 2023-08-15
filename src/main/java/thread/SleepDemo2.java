package thread;

public class SleepDemo2 {

    public static void main(String[] args) {
        Thread wang=new Thread() {
            public void run() {
                System.out.println("呼叫老王中，等待老王接听，嘟嘟嘟。。。。");
                try {
                    Thread.sleep(10000);//设置阻塞指定的10000毫秒
                } catch (InterruptedException e) {
                    System.out.println("中断与老王的连线。。。。。");
                }
                System.out.println("结束");
            }
        };
        Thread chen=new Thread() {
            public void run() {
                System.out.println("打小调皮6下");
                for(int i=0;i<6;i++) {//循环6次
                    System.out.println("a~痛");
                    try {
                        Thread.sleep(1000);//设置阻塞指定的1000毫秒
                    } catch (InterruptedException e) {
                    }
                }
                System.out.println("打完了!");
                wang.interrupt();//此时wang还在阻塞中，我们直接将其中断线程的睡眠阻塞
            }
        };

        wang.start();//启动线程要调用start
        chen.start();//启动线程要调用start
    }

}