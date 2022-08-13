import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed = -3;
    int count = 0;
    public Enemy(){
        getImage().mirrorHorizontally();
    }
    public void act()
    {
        // Add your action code here.
        count++;
        moveAround();
    }
    public void moveAround(){
        if(count < 30)
        setLocation(getX() + speed, getY());
        else{
            speed = -speed;
            getImage().mirrorHorizontally();
            count = 0;
        }
    }
}
