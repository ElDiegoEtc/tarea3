package interfaz;

import tarea3.CocaCola;

import java.awt.*;

public class CocaColavista {
    public CocaColavista(){

    }
    public void paint(Graphics g, CocaCola coca, int x, int y){
        g.setColor(Color.red);
        g.fillRect (x, y, 10, 15);
    }
}
