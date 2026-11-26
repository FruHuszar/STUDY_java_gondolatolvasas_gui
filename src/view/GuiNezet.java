package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
- @author HuszárFruzsinaAnna(S
 */

public class GuiNezet extends JFrame {
    private final JTextField[] kartyak = new JTextField[22];
    private final JButton[] btnOszlopok = new JButton[3];
    private final JButton btnUjJatek = new JButton("Új Játék");
    private final JButton btnBezaras = new JButton("Bezárás");
    private final JTextField txfKitalalt = new JTextField();

    public GuiNezet() {
        super("Gondolat Olvasó Program");
        setSize(530, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JLabel lblCim = new JLabel("Gondolj Egy Kártyára", SwingConstants.CENTER);
        /**
         * Paraméterek: betűtípus, betúformázás, betűméret
         */
        lblCim.setFont(new Font("Arial", Font.BOLD, 24));
        add(lblCim, BorderLayout.NORTH);

        JPanel pnlKartyak = new JPanel(new GridLayout(8, 3, 2, 1));
        for (int i = 1; i < kartyak.length; i++) {
            kartyak[i] = new JTextField();
            kartyak[i].setEditable(false);
            pnlKartyak.add(kartyak[i]);
        }
        for (int i = 0; i < btnOszlopok.length; i++) {
            btnOszlopok[i] = new JButton(String.valueOf(i+1));
            pnlKartyak.add(btnOszlopok[i]);
        }
        
        JPanel pnlBal = new JPanel(new BorderLayout());
        pnlBal.add(new JLabel("Melyik oszlopban van a kártyád?"), BorderLayout.NORTH);
        pnlBal.add(pnlKartyak, BorderLayout.CENTER);

        txfKitalalt.setEditable(false);
        JPanel pnlKitalalt = new JPanel(new GridLayout(2, 1));
        pnlKitalalt.add(new JLabel("A kártya amire gondoltál:"));
        pnlKitalalt.add(txfKitalalt);
        JPanel pnlJobb = new JPanel(new BorderLayout());
        pnlJobb.add(pnlKitalalt, BorderLayout.NORTH);

        JPanel pnlKozep = new JPanel(new GridLayout(1, 2, 30, 0));
        pnlKozep.setBorder(BorderFactory.createEmptyBorder(10, 30, 10, 30));
        pnlKozep.add(pnlBal);
        pnlKozep.add(pnlJobb);
        add(pnlKozep, BorderLayout.CENTER);

        JPanel pnlAlul = new JPanel(new FlowLayout());
        pnlAlul.add(btnUjJatek);
        pnlAlul.add(btnBezaras);
        add(pnlAlul, BorderLayout.SOUTH);

        btnBezaras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        setLocationRelativeTo(null);
    }

    public JButton[] getBtnOszlopok() {
        return btnOszlopok;
    }

    public JButton getBtnUjJatek() {
        return btnUjJatek;
    }

    public void kirak(String[] lapok) {
        for (int i = 1; i < lapok.length; i++) {
            kartyak[i].setText(lapok[i]);
        }
    }

    public void eredmeny(String lap) {
        txfKitalalt.setText(lap);
    }
}