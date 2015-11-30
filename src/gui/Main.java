package gui;
import java.awt.EventQueue;
import java.awt.Color;

/**
 * Launch Application.
 * @author Emrullah Celik
 * @version 11/26/15
 *
 */
public class Main {

    /**
     * Launch the application.
     * @param theArgs run frame.
     */
    public static void main(final String[] theArgs) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    final MenuFrame gui = new MenuFrame();
                    gui.setBackground(new Color(204, 204, 255));
                    gui.start();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

}
