package controller;

import model.PakliModel;
import view.GuiNezet;

/**
 *
 * @author HuszárFruzsinaAnna(S
 */
public class Vezerlo {
    private PakliModel m;
    private GuiNezet gn;
    
    public Vezerlo(PakliModel m, GuiNezet gn) {
        this.m = m;
        this.gn = gn;
    }
    
    /* Az eredeti programból ide tartozó részek áthelyezve:
    
    // Indoklás: Játék megoldása = Vezérlő
        // visszaadjuk a középső lapot, ami 21 elemnél a [11]
        private String ezVolt() {
            //System.out.println("A választott lap: " + pakli[11]);
            return pakli[11];
        }
    
    // Indoklás: Tippelés = Játékmenet = Vezérlő
        // Scanner 1-3 közötti szám
        private int melyik() {
            boolean jo;
            int oszlop;
            do {
                System.out.print("melyik oszlop (1-3): ");
                oszlop = sc.nextInt();
                jo = oszlop >= 1 && oszlop <= 3;
                if(!jo){
                    System.out.println("Hibás, újra!");
                }
            } while (!jo);

            return oszlop;
        }
    
    // Indoklás: Oszlop alapján van a keverés, de a pakli nem tudja magáról hogy oszlopokban van
        // választott oszlop középre, a sorrendje ne változzon!
        private void kever(int oszlop) {
            String[] uj = new String[22];
            switch(oszlop){
                case 1 -> {
                    for (int i = 1; i <= 7; i++) {
                        uj[i] = pakli[ 20-(i-1)*3];
                        uj[i+7] = pakli[ 19-(i-1)*3];
                        uj[i+14] = pakli[ 21-(i-1)*3];
                    }
                }
                case 2 -> {
                    for (int i = 1; i <= 7; i++) {
                        uj[i] = pakli[ 19-(i-1)*3];
                        uj[i+7] = pakli[ 20-(i-1)*3];
                        uj[i+14] = pakli[ 21-(i-1)*3];
                    }
                }
                case 3 -> {
                    for (int i = 1; i <= 7; i++) {
                        uj[i] = pakli[ 21-(i-1)*3];
                        uj[i+7] = pakli[ 19-(i-1)*3];
                        uj[i+14] = pakli[ 20-(i-1)*3];
                    }
                }
            }
            pakli = uj;
        }
    */
}
