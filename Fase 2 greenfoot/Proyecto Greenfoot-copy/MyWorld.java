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
        super(2500, 700, 1, false); 
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
        tall tall = new tall(100, 100);
        addObject(tall,922,358);
        tall tall2 = new tall(100, 300);
        addObject(tall2,1170,137);
        tall2.setLocation(1280,306);
        tall.setLocation(778,413);
        tall2.setLocation(1004,366);
        tall tall3 = new tall(300, 100);
        addObject(tall3,452,211);
        tall3.setLocation(610,134);
        tall.setLocation(423,447);
        tall.setLocation(423,482);
        tall2.setLocation(686,434);
        removeObject(tall2);
        tall3.setLocation(738,342);
        tall tall7 = new tall(50, 50);
        addObject(tall7,930,158);
        tall2.setLocation(935,192);
        tall tall4 = new tall(50, 50);
        addObject(tall4,1117,192);
        tall4.setLocation(1104,193);
        tall tall5 = new tall(20, 100);
        addObject(tall5,1274,417);
        tall5.setLocation(1256,492);
        wide wide = new wide();
        addObject(wide,2078,671);
        wide.setLocation(2046,633);
        tall tall8 = new tall(20, 20);
        addObject(tall8,1516,391);
        tall8.setLocation(1444,405);
        tall8.setLocation(1576,393);
        tall7.setLocation(1416,389);
        tall tall10 = new tall(10, 10);
        addObject(tall10,1574,368);
        tall10.setLocation(1570,357);
        tall7.setLocation(1587,400);
        tall4.setLocation(1400,366);
        tall5.setLocation(1170,71);
        tall5.setLocation(1110,198);
        tall5.setLocation(1076,225);
        removeObject(tall7);
        removeObject(tall4);
    }
}
