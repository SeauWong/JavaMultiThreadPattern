package ProducerConsumer;

import java.util.Random;

/**
 * Created by WongCU on 2018/3/22.
 */
public class EaterThread extends Thread {
    private final Random random;
    private final Table table;

    public EaterThread(String name, Table table, long seed) {
        super(name);
        this.table = table;
        random = new Random(seed);
    }

    @Override
    public void run() {
        try {
            while (true) {
                table.take();
                Thread.sleep(random.nextInt(1000));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
