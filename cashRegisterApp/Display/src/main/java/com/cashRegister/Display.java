package com.cashRegister;

import javax.swing.*;
import java.awt.*;

public class Display extends JFrame{
    static int UPCCode = Scanner.getUPC();

    public Display() {
        super("Scan UPC code: " + UPCCode);
        init();

    }

    private void init() {
        setLayout(new FlowLayout());
        add(new JLabel("Scan UPC code: " + UPCCode));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(640, 480);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Display().setVisible(true);
            }
        });
    }
}
