package balking;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 *
 * @author WongCU
 * @date 2018/3/22
 */
public class Data {

    private String fileName;

    private String content;

    private volatile boolean changed;

    public Data(String fileName, String content) {
        this.fileName = fileName;
        this.content = content;
    }

    public synchronized void change(String content){
        this.content = content;
        this.changed = true;
    }

    public synchronized void save() throws IOException {
        if(!changed){
            return;
        }
        doSave();
        this.changed = false;
    }

    private void doSave() throws IOException {
        System.out.println(Thread.currentThread().getName() + " calls doSave, content = " + content);
        Writer writer = new FileWriter(fileName);
        writer.write(content);
        writer.close();
    }
}
