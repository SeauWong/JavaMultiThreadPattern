package SingleThreadedExecution;

/**
 *
 * @author WongCU
 * @date 2018/3/16
 */
public class UserThread extends Thread {
    private final Gate gate;
    private final String myname;
    private final String myaddress;

    public UserThread(Gate gate, String myname, String myaddress) {
        this.gate = gate;
        this.myname = myname;
        this.myaddress = myaddress;
    }

    @Override
    public void run(){
        System.out.println(myaddress + "BEGIN");
        while(true){
            gate.pass(myname,myaddress);
        }
    }
}
