package app;

import controller.Vezerlo;
import model.PakliModel;
import view.GuiNezet;

/**
 *
 * @author HuszárFruzsinaAnna(S
 */
public class Program {
    public static void main(String[] args) {
        GuiNezet gn = new GuiNezet();
        PakliModel m = new PakliModel();
        
        Vezerlo v = new Vezerlo(m,gn);
    }
}
