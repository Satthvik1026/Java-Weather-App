import javax.swing.*;

public class appLauncher {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                //display our weather app gui
                new wheather_app().setVisible(true);

            }
        });
    }
}
