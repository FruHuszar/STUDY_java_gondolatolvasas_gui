package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import model.PakliModel;
import view.GuiNezet;

/**
 *
 * @author HuszárFruzsinaAnna(S
 */
public class Vezerlo {
    private final PakliModel modell;
    private final GuiNezet nezet;
    private int kor = 0;

    public Vezerlo(PakliModel modell, GuiNezet nezet) {
        this.modell = modell;
        this.nezet = nezet;

        nezet.kirak(modell.getPakli());

        JButton[] gombok = nezet.getBtnOszlopok();
        for (int i = 0; i < gombok.length; i++) {
            int oszlop = i + 1;
            gombok[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    valasztott(oszlop);
                }
            });
        }

        nezet.getBtnUjJatek().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ujJatek();
            }
        });
    }

    private void valasztott(int oszlop) {
        if (kor >= 3) {
            return;
        }
        modell.kever(oszlop);
        kor++;
        nezet.kirak(modell.getPakli());
        if (kor == 3) {
            nezet.eredmeny(modell.getKozepso());
        }
    }

    private void ujJatek() {
        modell.feltolt();
        kor = 0;
        nezet.kirak(modell.getPakli());
        nezet.eredmeny("");
    }
}