/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part1;

import TurtleGraphics.Pen;
import TurtleGraphics.RainbowPen;
import TurtleGraphics.SketchPadWindow;
import TurtleGraphics.StandardPen;
import TurtleGraphics.WigglePen;

/**
 *
 * @author jary0160
 */
public class ObjectExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pen p1 = new StandardPen();
        p1.move(25);
        p1.move(-30,50);
        
        
        
        SketchPadWindow w = new SketchPadWindow(500,500);
        WigglePen wp = new WigglePen(w);
        Pen rp = new RainbowPen(w);
        
        
        wp.move(200);
        rp.setDirection(145);
        rp.move(100);
        
    }
    
}
