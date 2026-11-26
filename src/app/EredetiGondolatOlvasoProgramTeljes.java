package app;

import java.util.Arrays;
import java.util.Scanner;

public class EredetiGondolatOlvasoProgramTeljes {

    private static Scanner sc = new Scanner(System.in);
    
    static String[] pakli = new String[22];
    
    public static String[] getPakli(){
        return Arrays.copyOf(pakli, pakli.length);
    }
    
    public static void main(String[] args) {
        feltolt();
        for (int i = 0; i < 3; i++) {
            kirak();//1 tömb
            int oszlop = melyik(); //Scanner
            kever(oszlop); //középre
        }
        ezVolt(); //11., azaz középső lap
    }

    public static void feltolt() {
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

    /**
     * tömb elemeit hármasával
     */
    private static void kirak() {
        System.out.printf("%-8s%-8s%-8s\n", "1. o.", "2. o.", "3. o.");
        for (int i = 1; i < pakli.length; i++) {
            System.out.printf("%-8s", pakli[i]);
            if(i % 3 == 0){
                System.out.println("");
            }
        }
    }

    /**
     * Scanner 1-3 közötti szám
     */
    private static int melyik() {
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

    /**
     * választott oszlop középre, a sorrendje ne változzon!
     */
    public static void kever(int oszlop) {
        String[] uj = new String[22];
        
        for (int i = 1; i <= 7; i++) {
            
            String oszlop1 = pakli[1 + (i - 1) * 3];
            String oszlop2 = pakli[2 + (i - 1) * 3];
            String oszlop3 = pakli[3 + (i - 1) * 3];

            switch (oszlop) {
                case 1:
                    // 2. oszlop felül, 1. oszlop középen, 3. oszlop alul
                    uj[i]      = oszlop2;
                    uj[i + 7]  = oszlop1;
                    uj[i + 14] = oszlop3;
                    break;
                case 2:
                    // 1. oszlop felül, 2. oszlop középen, 3. oszlop alul
                    uj[i]      = oszlop1;
                    uj[i + 7]  = oszlop2;
                    uj[i + 14] = oszlop3;
                    break;
                case 3:
                    // 1. oszlop felül, 3. oszlop középen, 2. oszlop alul
                    uj[i]      = oszlop1;
                    uj[i + 7]  = oszlop3;
                    uj[i + 14] = oszlop2;
                    break;
            }
        }
        
        pakli = uj;
    }
    /**
     * visszaadjuk a középső lapot, ami 21 elemnél a [11]
     */
    public static String ezVolt() {
        System.out.println("A választott lap: " + pakli[11]);
        return pakli[11];
    }
}
