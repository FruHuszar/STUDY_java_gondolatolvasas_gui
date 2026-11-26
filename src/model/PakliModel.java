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

    public String[] getPakli() {
        return Arrays.copyOf(pakli, pakli.length);
    }

    public void feltolt() {
        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertekek = {"Ász", "Kir", "Fel", "X", "IX", "VIII"};
        int db = 0;
        for (String szin : szinek) {
            for (String ertek : ertekek) {
                String lap = szin + "_" + ertek;
                if (db < 21) {
                    pakli[++db] = lap;
                }
            }
        }
    }

    /*Vezérlőből->modellbe | Indoklás: A paklihoz tartozik akeverés*/
    public void kever(int oszlop) {
        String[] uj = new String[22];
        for (int i = 1; i <= 7; i++) {

            String oszlop1 = pakli[1 + (i - 1) * 3];
            String oszlop2 = pakli[2 + (i - 1) * 3];
            String oszlop3 = pakli[3 + (i - 1) * 3];

            // Ai segítséggel javítva mert az eredeti hibás volt
            switch (oszlop) {
                case 1:
                    uj[i] = oszlop2;
                    uj[i + 7] = oszlop1;
                    uj[i + 14] = oszlop3;
                    break;
                case 2:
                    uj[i] = oszlop1;
                    uj[i + 7] = oszlop2;
                    uj[i + 14] = oszlop3;
                    break;
                case 3:
                    uj[i] = oszlop1;
                    uj[i + 7] = oszlop3;
                    uj[i + 14] = oszlop2;
                    break;
            }
        }
        pakli = uj;
    }

    /*Vezérlőből->modellbe, és átnevezve | Indoklás: A pakli egy részét adja vissza, a pakli tudja magáról hogy a középső eleme mi*/
    public String getKozepso() {
        //System.out.println("A választott lap: " + pakli[11]);
        return pakli[11];
    }
}
