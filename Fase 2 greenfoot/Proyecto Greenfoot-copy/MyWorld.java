import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Crea el mundo con colores y pone los pisos del nivel y el jugador
        super(1700, 700, 1, false); 
        getBackground().setColor(new Color(20, 20, 235));
        getBackground().fill(); 
        addObject(new wide(), 0, 700);
        addObject(new wide(), 695, 700);
        addObject(new Player(), 50, 500);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        // Genera los pisos que estan suspendidos en el aire
        wide wide = new wide();
        addObject(wide,2078,671);
        wide.setLocation(2046,633);
        tall tall = new tall(100, 100);
        addObject(tall,973,461);
        tall.setLocation(1108,452);
        tall.setLocation(1025,463);
        tall.setLocation(1093,469);
        tall tall2 = new tall(50, 50);
        addObject(tall2,880,216);
        tall2.setLocation(895,272);
        tall tall3 = new tall(50, 50);
        addObject(tall3,1129,173);
        tall3.setLocation(1067,157);
        tall tall4 = new tall(20, 20);
        addObject(tall4,1296,197);
        tall4.setLocation(1279,211);
        tall tall5 = new tall(10, 20);
        addObject(tall5,1455,423);
        tall5.setLocation(1458,431);
        Enemy enemy = new Enemy();
        addObject(enemy,1139,389);
        Enemy enemy2 = new Enemy();
        addObject(enemy2,1110,585);
        Enemy enemy3 = new Enemy();
        addObject(enemy3,1679,525);
    }
}
