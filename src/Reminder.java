import java.util.Timer;
import java.util.TimerTask;


public class Reminder {
    Timer timer;

    public Reminder(int seconds) {
        timer = new Timer();
        timer.schedule(new RemindTask(), seconds * 1000);
    }

    class RemindTask extends TimerTask {
        public void run() {
            System.out.println("Час вичерпано!");
            timer.cancel();
        }
    }

    public static void main(String args[]) {
        System.out.println("Підготовка!");
        new Reminder(5);
        System.out.println("Запусскаємо таймер");
    }
}
