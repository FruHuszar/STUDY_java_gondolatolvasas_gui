package view;

import javax.swing.JFrame;

/**
 *
 * @author HuszárFruzsinaAnna(S
 */
public class GuiNezet extends JFrame {

    public GuiNezet() {
        // Most a java GUIval összerakott próba JFrame-et hívom meg, amíg nincs befejezve a GuiNezet osztály.
        // Nem funkcionális, nem csinál semmit, de látszik rajta a design, layout, és tudtam vele tesztelni hogy a vezerlo és program helyesen meghívja
        new DesignTervezo().setVisible(true);
    }
    
    /* Eredeti program idetartozó része áthelyezve:
    
    //Indoklás: Kirak = megjelenítés
        // tömb elemeit hármasával
        private void kirak() {
            System.out.printf("%-8s%-8s%-8s\n", "1. o.", "2. o.", "3. o.");
            for (int i = 1; i < pakli.length; i++) {
                System.out.printf("%-8s", pakli[i]);
                if(i % 3 == 0){
                    System.out.println("");
                }
            }
        }
    */
}
