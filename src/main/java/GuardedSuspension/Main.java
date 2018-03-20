package GuardedSuspension;

/**
 * Created by WongCU on 2018/3/20.
 */
public class Main {
    public static void main(String[] args) {
        RequestQueue requestQueue = new RequestQueue();
        new ClientThread("Alice",requestQueue,3141592L).start();
        new ServerThread("Boby",requestQueue,6535897).start();
    }
}
