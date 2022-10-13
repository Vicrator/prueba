/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package snake;

import java.awt.Color;
import static java.awt.Color.green;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author pavlo
 */
public class ContenidoJuego extends JPanel implements ActionListener{
    static final int PANTALLA=650;
    static final int CUADRITO_SIZE = 25;
    static final int CUADRITOS_PARALELO = (int) PANTALLA/CUADRITO_SIZE;

    
    static final int TOTAL_CUERPO =(int) (PANTALLA*PANTALLA)/CUADRITO_SIZE;
    int [] serpienteX=new int[TOTAL_CUERPO];
    int [] serpienteY=new int[TOTAL_CUERPO];
    int tamaño_serp=3;
    char direccion='d';
    
    int comidaY; 
    int comidaX;
    //TIMES
    int DELAY= 150;
    Timer tiempo;
    //OTROS
    boolean running = true;
    Random comidaRandom= new Random();
    
    ContenidoJuego(){
        this.setPreferredSize(new Dimension(PANTALLA,PANTALLA));
        this.setBackground(Color.black);
        this.setFocusable(true);
        this.addKeyListener(new Controles());
        iniciarJuego();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(running){
            moverSerpiente();
            checarComida();
            checarColisiones();
            
        }
        repaint();
            
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor( new Color(0, 180,255));
        g.fillOval(comidaX, comidaY, CUADRITO_SIZE, CUADRITO_SIZE);
        ///g.setColor(Color.getHSBColor(0, 1, 50)); para definir el color (nose, color, brillo)
        g.setColor(green);
        for(int i=0;i<tamaño_serp;i++){
            g.fillRect(serpienteX[i],serpienteY[i], CUADRITO_SIZE,CUADRITO_SIZE);
        }
        
    }
    
    public class Controles extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e){
            
            switch(e.getKeyChar()){
                case 'a':
                    if(direccion!='d'){
                        direccion='a';
                    }
                    
                    break;
                    
                case 'd':
                    if(direccion!='a'){
                        direccion='d';
                    }
                    break;
                    
                case 's':
                    if(direccion!='w'){
                        direccion='s';
                    }
                    break;
                
                case 'w':
                    if(direccion!='s'){
                        direccion='w';
                    }
                    break;
                    
            }
        }
    }
    
    public void iniciarJuego(){
        iniciarComida();
        tiempo= new Timer(DELAY,this);
        tiempo.start();
        
    }
    public void iniciarComida(){
        comidaX=comidaRandom.nextInt(CUADRITOS_PARALELO)*CUADRITO_SIZE;
        comidaY=comidaRandom.nextInt(CUADRITOS_PARALELO)*CUADRITO_SIZE;
        
    }
    
    public void checarColisiones(){
        for(int i=tamaño_serp;i>0;i--){
            if(serpienteX[0]==serpienteX[i] && serpienteY[0]==serpienteY[i]){
                running=false;
            }
        }
        if(serpienteX[0]<0){
            running= false;
    }
        
        if(serpienteX[0]==PANTALLA){
            running= false;
    }
        
        if(serpienteY[0]<0){
            running= false;
    }
        
        if(serpienteY[0]==PANTALLA){
            running= false;
    }
        
    }
    
    public void checarComida(){
        if(serpienteX[0]==comidaX && serpienteY[0]==comidaY){
            iniciarComida();
            tamaño_serp++;
            DELAY-=5;
            System.out.println(DELAY);
            tiempo.setDelay(DELAY);
            tiempo.start();

            
        }
    }
    
    
    public void moverSerpiente(){

        for(int i=tamaño_serp; i>0;i--){
            serpienteX[i]=serpienteX[i-1];
            serpienteY[i]=serpienteY[i-1];
            
        }
        
        switch(direccion){
            case 'a':
                serpienteX[0]=serpienteX[0]-CUADRITO_SIZE;
                break;
            case 'd':
                serpienteX[0]=serpienteX[0]+CUADRITO_SIZE;
                break;
            case 's':
                serpienteY[0]=serpienteY[0]+CUADRITO_SIZE;
                break;
            case 'w':
                serpienteY[0]=serpienteY[0]-CUADRITO_SIZE;
                break;
        }
        
    }
}

