/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package snake;

import javax.swing.JFrame;

/**
 *
 * @author pavlo
 */
public class PantallaJuego extends JFrame {
    PantallaJuego(){
        this.setTitle("VIVORITA");
        this.add(new ContenidoJuego());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        this.setResizable(false);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        
    }
}
