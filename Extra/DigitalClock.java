import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Clock extends JFrame {
    private JLabel timeLabel;

    public Clock() {
        setTitle("Clock");
        setSize(200, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Arial", Font.BOLD, 20));
        updateTime();

        add(timeLabel);

        // Create and start separate threads for hour, minute, and second
        Thread hourThread = new Thread(new TimeUpdater(3600000)); // 1 hour = 3600000 milliseconds
        Thread minuteThread = new Thread(new TimeUpdater(60000)); // 1 minute = 60000 milliseconds
        Thread secondThread = new Thread(new TimeUpdater(1000)); // 1 second = 1000 milliseconds

        hourThread.start();
        minuteThread.start();
        secondThread.start();

        setVisible(true);
    }

    private void updateTime() {
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String timeString = sdf.format(now);
        timeLabel.setText(timeString);
    }

    // Runnable class to update time
    class TimeUpdater implements Runnable {
        private long updateTimeInterval;

        public TimeUpdater(long interval) {
            updateTimeInterval = interval;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(updateTimeInterval); // Sleep for update interval
                    SwingUtilities.invokeLater(Clock.this::updateTime); // Update the GUI on the EDT
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        new Clock();
    }
}
