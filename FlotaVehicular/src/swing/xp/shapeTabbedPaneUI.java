package swing.xp;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import javax.swing.plaf.basic.BasicTabbedPaneUI;
/**
 * @web http://www.jc-mouse.net
 * @author Mouse
 */
public class shapeTabbedPaneUI extends BasicTabbedPaneUI{
    
    //Para almacenar la forma del tabs
    private Polygon shape;
    //Para almacenar los puntos de la forma poligonal del tabs o.O
    private int xp[] = null; 
    private int yp[] = null;
    
    @Override
 protected void paintTabBackground( Graphics g, int tabPlacement, int tabIndex, int x, int y, int w, int h, boolean isSelected ) 
 {
    Graphics2D g2D = (Graphics2D)g;
    //colores degradados para los tabs
    GradientPaint gradientSel = new GradientPaint( 0, 0,  new Color(231,185,42), 0, y+h/2, new Color(231,185,42) );
    GradientPaint gradientUnsel = new GradientPaint( 0, 0,  new Color(231,185,42), 0, y+h/2, new Color(231,185,42) );    
    
    switch( tabPlacement )
    {
        case LEFT: 
        case RIGHT:        
        case BOTTOM:
            /* codigo para estos tabs */
            break;
        case TOP:
        default:            
            xp = new int[]{ x, 
                            x,
                            x+5,
                            x+w+6,
                            x+w+6,
                            x+w,
                            x+w,
                            x
            };
            yp = new int[]{ y+h,
                            y+5,
                            y,
                            y,
                            y+6,
                            y+11,
                            y+h,
                            y+h
            };
          break;
    }
    
    shape = new Polygon( xp, yp, xp.length );
    
    if ( isSelected ) 
    {         
         g2D.setPaint( gradientSel );
    }
    else
    {        
        g2D.setPaint( gradientUnsel );
    }
    
     g2D.fill( shape );
 }
    
 @Override
  protected void paintTabBorder( Graphics g, int tabPlacement, int tabIndex, int x, int y, int w, int h, boolean isSelected) 
  {
      
    Graphics2D g2D = (Graphics2D)g;    
    
     switch( tabPlacement )
    {
        case LEFT: 
        case RIGHT:        
        case BOTTOM:
            /* codigo para estos tabs */
            break;
            
        case TOP:
        default:           
            xp = new int[]{ x, 
                            x,
                            x+5,
                            x+w+6,
                            x+w+6,
                            x+w,
                            x+w,
                            x
            };
            yp = new int[]{ y+h,
                            y+5,
                            y,
                            y,
                            y+6,
                            y+11,
                            y+h,
                            y+h
            };
          break;
    }
     
     shape = new Polygon( xp, yp, xp.length );
    
    if ( isSelected )
    {
         g2D.setColor( Color.yellow );
         g2D.drawPolyline( xp , yp , xp.length - 1 );
    }
    else
    {
        g2D.setColor( Color.yellow );
        g2D.drawPolyline( xp , yp , xp.length );
    }     
     
  } 
 
}//--> fin clase UI
