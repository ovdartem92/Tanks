package main;

import display.Display;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Main {
    public static void main(String[] args) {
        Display.created(800, 600, "Tanks. Since 1992");
        Timer t = new Timer(1000 / 60, new AbstractAction(

        ) {
            @Override
            public void actionPerformed(ActionEvent e) {
                Display.render();
            }
        });
        t.setRepeats(true);
        t.start();
    }
}
