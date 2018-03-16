package SingleThreadedExecution;

/**
 *
 * @author WongCU
 * @date 2018/3/16
 */
public class Gate {
    private int counter;
    private String name = "nobody";
    private String address = "nowhere";

    public synchronized void pass(String name,String address){
        this.counter++;
        this.name = name;
        this.address = address;
    }

    @Override
    public synchronized String toString(){
        return "NO." + counter + ":" + name + ", " + address;
    }

    private void check(){
        if(name.charAt(0) != address.charAt(0)){
            System.out.println("*********BROKEN*********" + toString());
        }
    }
}
