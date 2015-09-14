package week3;

import java.io.*;

/**
 * Created by Home on 08.09.2015.
 */
public class Saver<T> implements IServer<T>{
    private String path;
    public Saver(String path) {
        this.path = path;
    }



    @Override
    public void save(T t) {
        ObjectOutputStream os = null;
        try {
            os = new ObjectOutputStream(new FileOutputStream(path));
            os.writeObject(t);
            os.flush();
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
