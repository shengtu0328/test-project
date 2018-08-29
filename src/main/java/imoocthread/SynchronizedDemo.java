package imoocthread;

public class SynchronizedDemo {
	//???????
    private boolean ready = false;
    private int result = 0;
    private int number = 1;   
    //§Õ????
    public void write(){
    	ready = true;	      				 //1.1				
    	number = 2;		                    //1.2			    
    }
    //??????
    public void read(){			   	 
    	if(ready){						     //2.1
    		result = number*3;	 	//2.2
    	}   	
    	System.out.println("result:" + result);
    }

    //????????
    private class ReadWriteThread extends Thread {
    	//??????????§Õ????flag??????????????§Ø?????????§Õ????
    	private boolean flag;
    	public ReadWriteThread(boolean flag){
    		this.flag = flag;
    	}
        @Override                                                                    
        public void run() {
        	if(flag){
        		//???????§Õ???true?????§Õ????
        		write();
        	}else{
        		//???????§Õ???false????§Ø?????
        		read();
        	}
        }
    }

    public static void main(String[] args)  {
    	SynchronizedDemo synDemo = new SynchronizedDemo();
    	//??????????§Õ????
    	synDemo .new ReadWriteThread(true).start();
    	try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	//?????????§Ø?????
    	synDemo.new ReadWriteThread(false).start();
    }
}

