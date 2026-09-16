/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package displaygraphics;

import java.awt.*;
import javax.swing.*;


public class DisplayGraphics extends JPanel{
  
  //this is a constructor method.
  public DisplayGraphics(){
    super();
  }
  
    
  public void paintComponent(Graphics g){
    final int MID = 150;
    final int TOP = 50;
    g.setColor(Color.blue); //set the graphics object's paint color
    g.fillRect(0, 0, 850, 500);
    g.setColor(Color.green);
    g.fillRect(0, 300, 850, 200);
    g.setColor(Color.white);
    g.fillRoundRect(400, 200, 75, 300, 100, 50);
    g.setColor(Color.red);
    g.fillPolygon(new int[]{400, 437, 475}, new int[]{220, 20, 220,}, 3);
    g.setColor(Color.red);
 


g.fillPolygon(
    new int[]{400, 400, 250},
    new int[]{450, 350, 450},
    3
);

// 3. Mirrored across vertical axis and placed 50 units away
g.fillPolygon(
    new int[]{475, 475, 625},
    new int[]{450, 350, 450},
    3
);

    
    
    
    //for next action
    
  }

    /**
     * @param args the command line arguments
     */
    public static void main(String arg[]){
        
        JFrame frame = new JFrame("Display Graphics");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);

      
        DisplayGraphics panel = new DisplayGraphics();

      
        frame.setContentPane(panel);
        frame.setVisible(true);
    }
    
}