package immutable;

/**
 *
 * @author WongCU
 * @date 2018/3/19
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alice","Alaska");
        new PrintPersonThread(person).start();
        new PrintPersonThread(person).start();
        new PrintPersonThread(person).start();
    }
}
