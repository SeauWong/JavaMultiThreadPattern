package GuardedSuspension;

import java.util.Random;

/**
 * Created by WongCU on 2018/3/20.
 */
public class ClientThread extends Thread{

    private final Random random;

    private final RequestQueue requestQueue;

    public ClientThread(String name, RequestQueue requestQueue, long seed) {
        super(name);
        this.requestQueue = requestQueue;
        this.random = new Random(seed);
    }

    @Override
    public void run(){
        for(int i = 0; i < 10000; i++){
            Request request = new Request("No." + i);
            System.out.println(Thread.currentThread().getName() + " request: " + request);
            requestQueue.putRequst(request);
            try {
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
