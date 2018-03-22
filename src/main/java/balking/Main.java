package balking;

/**
 *
 * @author WongCU
 * @date 2018/3/22
 */
public class Main {
    public static void main(String[] args) {
        Data data = new Data("data.txt","empty");
        new ChangerThread("ChangerThread",data).start();
        new SaverThread("SaverThread",data).start();
    }
}
