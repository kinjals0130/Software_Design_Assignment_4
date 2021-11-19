package com.cashRegister;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Display extends JFrame{
    static JTextField UPCCode = Scanner.getUPC();

    public Display() {
        super("Cash Register");
        init();

    }

    private void init() {
        setLayout(new FlowLayout());
        add(new JLabel("Scan UPC code: "));
        add(UPCCode);
        UPCCode.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(ProductsDB.GetProductInfo(UPCCode.getText()));
                add(new JLabel(ProductsDB.GetProductInfo(UPCCode.getText()).toString()));
            }
        });
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
