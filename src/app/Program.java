package app;

import controller.Vezerlo;
import javax.swing.SwingUtilities;
import model.PakliModel;
import view.GuiNezet;

/**
 *
 * @author HuszárFruzsinaAnna(S
 */
public class Program {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                PakliModel modell = new PakliModel();
                GuiNezet nezet = new GuiNezet();
                new Vezerlo(modell, nezet);
                nezet.setVisible(true);
            }
        });
    }
}
