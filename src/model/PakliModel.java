package model;

import java.util.Arrays;

/**
 *
 * @author HuszárFruzsinaAnna(S
 */
public class PakliModel {
     
    private String[] pakli = new String[22];

    public PakliModel() {
        feltolt();
    }
    
    private String[] getPakli(){
        return Arrays.copyOf(pakli, pakli.length);
    }

    private void feltolt() {
        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertekek = {"Ász", "Kir", "Fel", "X", "IX", "VIII"};
        int db = 0;
        for (String szin : szinek) {
            for (String ertek : ertekek) {
                String lap = szin + "_" + ertek;
                if(db < 21){
                    pakli[++db] = lap;
                }
            }
        }
    }
}
