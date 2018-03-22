package ProducerConsumer;

/**
 * Created by WongCU on 2018/3/22.
 */
public class Main {
    public static void main(String[] args) {
        Table table = new Table(10);
        new MakerThread("MakerThread",table,314159).start();
        new EaterThread("EaterThread",table,265718).start();
    }
}
