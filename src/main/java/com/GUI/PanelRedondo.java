package com.GUI;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JPanel;

/**
 *
 * @author ronny12301
 */
public class PanelRedondo extends JPanel {

    private int bordeSuperiorIzq = 0;
    private int bordeSuperiorDer = 0;
    private int bordeInferiorIzq = 0;
    private int bordeInferiorDer = 0;
    
    public PanelRedondo() {
        setOpaque(false);
    }
    
    public int getBordeSuperiorIzq() {
        return bordeSuperiorIzq;
    }

    public void setBordeSuperiorIzq(int bordeSuperiorIzq) {
        this.bordeSuperiorIzq = bordeSuperiorIzq;
        repaint();
    }

    public int getBordeSuperiorDer() {
        return bordeSuperiorDer;
    }

    public void setBordeSuperiorDer(int bordeSuperiorDer) {
        this.bordeSuperiorDer = bordeSuperiorDer;
        repaint();
    }

    public int getBordeInferiorIzq() {
        return bordeInferiorIzq;
    }

    public void setBordeInferiorIzq(int bordeInferiorIzq) {
        this.bordeInferiorIzq = bordeInferiorIzq;
        repaint();
    }

    public int getBordeInferiorDer() {
        return bordeInferiorDer;
    }

    public void setBordeInferiorDer(int bordeInferiorDer) {
        this.bordeInferiorDer = bordeInferiorDer;
        repaint();
    }

    
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        
        Area area = new Area(crearBordeSuperiorIzq());
        if (bordeSuperiorDer > 0) {
            area.intersect(new Area(crearBordeSuperiorDer()));
        }
        if (bordeSuperiorDer > 0) {
            area.intersect(new Area(crearBordeInferiorIzq()));
        }
        if (bordeSuperiorDer > 0) {
            area.intersect(new Area(crearBordeInferiorDer()));
        }
        
        g2.fill(area);
        g2.dispose();
           
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    private Shape crearBordeSuperiorIzq() {
        int ancho = getWidth();
        int altura = getHeight();
        int rX = Math.min(ancho, bordeSuperiorIzq);
        int rY = Math.min(altura, bordeSuperiorIzq);
        Area area = new Area(new RoundRectangle2D.Double(0, 0, ancho, altura, rX, rY));
        area.add(new Area(new Rectangle2D.Double(rX / 2, 0, ancho - rX / 2, altura)));
        area.add(new Area(new Rectangle2D.Double(0, rY / 2, ancho, altura - rY / 2)));

        return area;
    }
    
    private Shape crearBordeSuperiorDer() {
        int ancho = getWidth();
        int altura = getHeight();
        int rX = Math.min(ancho, bordeSuperiorDer);
        int rY = Math.min(altura, bordeSuperiorDer);
        Area area = new Area(new RoundRectangle2D.Double(0,0,ancho, altura, rX, rY));
        area.add(new Area(new Rectangle2D.Double(0,0,ancho-rX/2,altura)));
        area.add(new Area(new Rectangle2D.Double(0,rY/2, ancho, altura-rY/2)));
        
        return area;
    }
    
    private Shape crearBordeInferiorIzq() {
        int ancho = getWidth();
        int altura = getHeight();
        int rX = Math.min(ancho, bordeInferiorIzq);
        int rY = Math.min(altura, bordeInferiorIzq);
        Area area = new Area(new RoundRectangle2D.Double(0,0,ancho, altura, rX, rY));
        area.add(new Area(new Rectangle2D.Double(rX/2,0,ancho-rX/2,altura)));
        area.add(new Area(new Rectangle2D.Double(0,0, ancho, altura-rY/2)));
        
        return area;
    }
    private Shape crearBordeInferiorDer() {
        int ancho = getWidth();
        int altura = getHeight();
        int rX = Math.min(ancho, bordeInferiorDer);
        int rY = Math.min(altura, bordeInferiorDer);
        Area area = new Area(new RoundRectangle2D.Double(0,0,ancho, altura, rX, rY));
        area.add(new Area(new Rectangle2D.Double(0,0,ancho-rX/2,altura)));
        area.add(new Area(new Rectangle2D.Double(0,0, ancho, altura-rY/2)));
        
        return area;
    }
}
