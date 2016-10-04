
/**
 * Write a description of class Flower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flower
{
    private int x;
    private int y;
   
    public Flower(int theX, int theY)
    {
        // TODO
        x= theX;
        y= theY;
    }
    
    /**
    * This function draws the flower.
    */
    public void draw()
    {
        Ellipse a1 = new Ellipse(x+30, y+10, 20,20);
        Ellipse a2 = new Ellipse(x+10, y+30, 20,20);
        Ellipse a3 = new Ellipse(x+50, y+10, 20,20);
        Ellipse a4 = new Ellipse(x+30, y+50, 20,20);
        Ellipse a5 = new Ellipse(x+30, y+30, 20,20);
        a1.setColor(Color.PINK);
        a2.setColor(Color.PINK);
        a3.setColor(Color.PINK);
        a4.setColor(Color.PINK);
        a5.setColor(Color.YELLOW);
        a1.fill();
        a2.fill();
        a3.fill();
        a4.fill();
        a5.fill();
        
        
        // TODO
        Line line = new Line(x+30,x+60,x+50,x+120);
        line.setColor(Color.GREEN);
        line.draw();
    }
}
