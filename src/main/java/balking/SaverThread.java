package balking;

import java.io.IOException;

/**
 *
 * @author WongCU
 * @date 2018/3/22
 */
public class SaverThread extends Thread {

    private final Data data;

    public SaverThread(String name, Data data) {
        super(name);
        this.data = data;
    }

    @Override
    public void run(){
        try {
            while (true){
                data.save();
                Thread.sleep(1000L);
            }
        }catch (IOException e){
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
