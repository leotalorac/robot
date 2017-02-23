/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package becker;
import becker.robots.*;

public class soccer {
    private Robot luis;
    private City london;
    private Thing balon;
    
    
    public soccer(){
        this.london = new City(5,9);
        this.balon = new Thing(this.london, 3, 8);
        this.luis = new Robot(this.london,3,8,Direction.WEST);
        //paredes derechas
        Wall blockAve0 = new Wall(london, 0, 0, Direction.WEST);
        Wall blockAve1 = new Wall(london, 1, 0, Direction.WEST);
        Wall blockAve2 = new Wall(london, 3, 0, Direction.WEST);
        Wall blockAve3 = new Wall(london, 4, 0, Direction.WEST);
        //paredes izquierda
        Wall blockAve4 = new Wall(london, 0 ,8, Direction.EAST);
        Wall blockAve5 = new Wall(london, 1, 8, Direction.EAST);
        Wall blockAve6 = new Wall(london, 3, 8, Direction.EAST);
        Wall blockAve7 = new Wall(london, 4, 8, Direction.EAST);
        
        
    }
    public void advance(){
            this.luis.pickThing();
            this.luis.move(); 
            this.luis.move();
            this.luis.putThing();
    }
    public void advanceLeft(){
        this.luis.pickThing();
        this.luis.turnLeft();
        this.luis.move();
        for(int i =0;i<3;i++){
            this.luis.turnLeft();
        }
        this.luis.move();
        this.luis.move();
    }
    public void advanceRight(){
        this.luis.pickThing();
        this.luis.move();   
        this.luis.move();   
        for(int i =0;i<3;i++){
            this.luis.turnLeft();
        }
        this.luis.move();
        this.luis.turnLeft();
        this.luis.putThing();
        

    }
    
    
    
    
}
