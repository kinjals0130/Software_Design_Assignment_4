package com.cashRegister;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Scanner {

    public static JTextField getUPC() {
        final JTextField upcCodeInput = new JTextField(10);
        return upcCodeInput;
    }


}
