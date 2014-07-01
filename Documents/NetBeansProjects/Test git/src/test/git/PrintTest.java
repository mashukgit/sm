/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.git;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicArrowButton;

/**
 *
 * @author Mashuk
 */
public class PrintTest extends JFrame {

    private PrintPane printPane;
    private JPanel printOptionPane;
    private JButton printButton;

    public PrintTest() throws HeadlessException {
        init();
    }

    private void init() {
        printOptionPane = new JPanel();
        printPane = new PrintPane();
        printButton = new JButton("Print");

        setSize(800, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        printButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                PrinterJob job = PrinterJob.getPrinterJob();
                job.setPrintable(printPane);
                boolean ok = job.printDialog();
                if (ok) {
                    try {
                        job.print();
                    } catch (PrinterException ex) {
                    }
                }
               // printPane.printAll(printPane.getGraphics());
            }
        });
        printOptionPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
        printOptionPane.add(printButton);

        getContentPane().add(printOptionPane, BorderLayout.NORTH);
        getContentPane().add(printPane, BorderLayout.CENTER);

    }

    public static void main(String[] args) {
        new PrintTest().setVisible(true);
    }
}
