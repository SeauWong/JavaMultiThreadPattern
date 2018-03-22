package balking;

import java.io.IOException;
import java.util.Random;

/**
 * Created by WongCU on 2018/3/22.
 */
public class ChangerThread extends Thread {

    private final Data data;

    private final Random random = new Random();

    public ChangerThread(String name, Data data) {
        super(name);
        this.data = data;
    }

    @Override
    public void run(){
        try {
            for(int i = 0; true ; i++){
                data.change("NO." + i);
                Thread.sleep(random.nextInt(1000));
                data.save();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
