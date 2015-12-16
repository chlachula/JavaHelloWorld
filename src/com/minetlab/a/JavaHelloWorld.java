/*
 * Josef Chlachula
 * jch@minetlab.com
 */
package com.minetlab.a;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * HelloWorld on command line
 * Update from IntelliJ IDEA 15
 *
 * @author Josef Chlachula
 */
public class JavaHelloWorld {

    public JavaHelloWorld() {
        JFrame frame = new JFrame();

        //Exit when the frame is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Example GUI");
        frame.setSize(150, 75);

        //Center the JFrame to the middle of the screen
        frame.setLocationRelativeTo(null);

        JLabel listLbl = new JLabel("Hello World!");
        frame.add(listLbl, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    private static void help(String msg) {
        if (msg != null) {
            System.out.println(msg + "\n");
        }
        System.out.println("Usage:");
        System.out.println("java JavaHelloWorld [-window]");
        System.out.println(" no argument: Hello World on command line");
        System.out.println(" -window argument: Hello World at GUI Window");
        System.out.println("Examples:");
        System.out.println("java JavaHelloWorld           // command line message");
        System.out.println("java JavaHelloWorld -window   // GUI message");
        System.out.println("java JavaHelloWorld -blabla   // unknown argument...help");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (args.length <= 0) {
            System.out.println("Hello World!");
        } else {
            if (args[0].equalsIgnoreCase("-window")) {
                new JavaHelloWorld();
            } else {
                help("Missing arguments");
                System.exit(1);
            }
        }
    }
}
