package com.jack.imooc.thread;

public class RunnableYes implements Runnable {

	int tickets = 50;
	@Override
	public void run() {
		if(true){
			while(tickets > 1){
				System.out.println(Thread.currentThread().getName()+""+tickets--);
			}
		}

	}

}
