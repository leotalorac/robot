/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package becker;
import becker.robots.*;
/**
 *
 * @author Estudiante
 */
public class Numberdiscover {
    private Robot luis;
    private City mistery;
    private Thing pixel;
    
    public Numberdiscover(){
        this.mistery = new City(9,11);
        this.luis = new Robot(mistery,6,2,Direction.NORTH,0);
        this.pixel = new Thing(this.mistery,5,2);
        //escenario
        for(int i=1;i<10;i++){
            Wall pared1 = new Wall(this.mistery,1,i,Direction.NORTH);   
        }      
        for(int i=1;i<6;i++){
            Wall pared1 = new Wall(this.mistery,i,1,Direction.WEST);   
            Wall pared2 = new Wall(this.mistery,i,4,Direction.WEST);   
            Wall pared3 = new Wall(this.mistery,i,7,Direction.WEST);   
            Wall pared4 = new Wall(this.mistery,i,9,Direction.EAST);   
        }
            Wall p1 = new Wall(this.mistery,5,1,Direction.SOUTH);   
            Wall p2 = new Wall(this.mistery,5,3,Direction.SOUTH);   
            Wall p3 = new Wall(this.mistery,5,4,Direction.SOUTH);   
            Wall p4 = new Wall(this.mistery,5,6,Direction.SOUTH);   
            Wall p5 = new Wall(this.mistery,5,7,Direction.SOUTH);   
            Wall p6 = new Wall(this.mistery,5,9,Direction.SOUTH);       
         
    }
    
    public void scan(){
        this.luis.move();
        if(this.luis.canPickThing()){
            this.luis.pickThing();                
        }
        for(int i =0;i<3;i++){
            this.luis.turnLeft();
        }
        this.luis.move();
        this.luis.turnLeft();
        
        int h =0;
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                if(this.luis.canPickThing()){
                    this.luis.pickThing();                
                }
                this.luis.move();
            }
            if(h ==0){
                this.luis.turnLeft();
                h++;
                this.luis.move();
                this.luis.turnLeft();
            }else{
              for(int k =0;k<3;k++){
                    this.luis.turnLeft();
              }
              this.luis.move();
              for(int k =0;k<3;k++){
                    this.luis.turnLeft();
              }
              
              
            }
            
            if(this.luis.canPickThing()){
                    this.luis.pickThing();                
                }     
        }
    }}
