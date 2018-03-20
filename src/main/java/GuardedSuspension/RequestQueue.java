package GuardedSuspension;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author WongCU
 * @date 2018/3/20
 */
public class RequestQueue {

    private Queue<Request> requestQueue = new LinkedList<Request>();

    public synchronized Request getRequest(){
        while(requestQueue.size() == 0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return requestQueue.remove();
    }

    public synchronized void putRequst(Request request){
        requestQueue.add(request);
        notifyAll();
    }
}
