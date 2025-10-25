import java.io.*;

class Producer extends Thread {
    OutputStream os;
    public Producer(OutputStream o) {
        this.os = o;
    }

    public void run() {
        int count = 1;
        while (true) {
            try {
                os.write(count);
                os.flush();
                System.out.println("producer is writing " + count);
                count++;
                Thread.sleep(200); // slow down a bit
            } catch (Exception e) {
                e.printStackTrace();
                break;
            }
        }
    }
}

class Consumer extends Thread {
    InputStream is;
    public Consumer(InputStream s) {
        this.is = s;
    }

    public void run() {
        int x;
        while (true) {
            try {
                x = is.read();
                System.out.println("consumer is reading " + x);
            } catch (Exception e) {
                e.printStackTrace();
                break;
            }
        }
    }
}

public class PipedStreamsdemo {
    public static void main(String[] args) throws Exception {
        PipedInputStream pis  = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();
        pis.connect(pos);

        Producer p = new Producer(pos);
        Consumer c = new Consumer(pis);

        p.start();
        c.start();
    }
}
