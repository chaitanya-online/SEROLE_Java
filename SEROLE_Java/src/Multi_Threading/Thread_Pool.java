package Multi_Threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Pool extends Thread {
	String name;

	public Pool(String name) {

		this.name = name;
	}

	public void run() {
		System.out.println(name + " Job Started by Thread " + Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException Exception) {

		}
		System.out.println(name + " Job done by " + Thread.currentThread().getName());
	}

}

public class Thread_Pool {
	public static void main(String[] args) {

		Pool[] jobs = { new Pool("Chaitanya"), new Pool("Murali"), new Pool("Babu"), new Pool("Nampalli"), };
		ExecutorService Service = Executors.newFixedThreadPool(2);
		for(Pool job:jobs)
		{
			Service.submit(job);
		}
		Service.shutdown();
		//System.out.println(Service.isShutdown());
	}

}
