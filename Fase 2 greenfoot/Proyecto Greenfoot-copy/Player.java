import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int vspeed = 0;
    int accel = 0;
    int speed = 5;  
    projectile projectilee = new projectile();
    public void act()
    {
        jump();
        checkfalling();
        fall();
        moveAround();
        fire();
        // Genera todos los metodos
    
    }
    public void fire(){
        // Genera un nuevo proyectil cada vez que se clickea el mouse
        if(Greenfoot.mousePressed(null)){
            projectile projectilee = new projectile();
            getWorld().addObject(projectilee, getX(), getY());
            projectilee.turnTowards(Greenfoot.getMouseInfo().getX(), Greenfoot.getMouseInfo().getY());
        }
    }
    public void moveAround(){
        // Hace que el personaje se mueva
        if(Greenfoot.isKeyDown("right")){
            setLocation(getX() + speed, getY());
        }
        if(Greenfoot.isKeyDown("left")){
            setLocation(getX() - speed, getY());
        }
    }
    public void fall()
    //Para que el personaje tenga caida
    {
        setLocation(getX(), getY() + vspeed);
    }
    
    public void checkfalling()
    // Para ver si ejecuta fall
    {
        if(!isTouching(ground.class))
        {
            vspeed ++;
        }
        else if(isTouching(ground.class)){
            setLocation(getX(), getY() - 1);
            vspeed = 0;
        }
    }
    public void jump(){
        // Genera el salto
        if (Greenfoot.isKeyDown("space")){
            vspeed = -10;
        }
    }
}
