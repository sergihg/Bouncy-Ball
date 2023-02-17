import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Turtle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Turtle extends Actor
{
    private int offsetX;
    private int offsetY;
    //private Random random = new Random();
    private static int nextOffset = 9;
    
    public Turtle(){
        offsetX = -nextOffset;
        offsetY = nextOffset;
        if(nextOffset>3){
             nextOffset -=3;   
        }
    }
    
    public void act()
    {
        int x = getX();
        int y = getY();
        
        setLocation(x+offsetX,y+offsetY);
        
        if(isAtEdge()){
            offsetY*=-1;
        }
        
        if(getX() >= 575 || getX() <= 0){
            offsetX *= -1;
        }
    }
}
