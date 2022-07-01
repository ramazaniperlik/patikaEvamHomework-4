import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {


        Runnable read =  new valueController();
        Thread t = new Thread(read);
        t.start();

    }
}
