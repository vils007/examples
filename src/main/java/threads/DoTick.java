package threads;

/**
 * Created by Администратор on 22.06.2017.
 */
public class DoTick implements Runnable{

    private String name;

    public DoTick(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 0; i<10; i++){
            System.out.println(name + " : " + i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
