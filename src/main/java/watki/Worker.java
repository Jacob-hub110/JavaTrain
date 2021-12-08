package watki;

public class Worker implements Runnable {

    private String name;

    public Worker(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(1000);
                System.out.println(name + " running...");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
