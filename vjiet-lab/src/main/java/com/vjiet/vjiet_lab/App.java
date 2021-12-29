package com.vjiet.vjiet_lab;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        First obj=new First(10,20);
        obj.display();
        Vehicle obj2 =new Vehicle(30);
        obj2.accelerate();
        obj2.reFuel();
        obj2.accelerate();
        FuelPump fuelpump =new FuelPump();
        FuelPump fuelpump1 =new FuelPump();
        fuelpump.show();
        fuelpump1.show();
        Demo demo= new Demo();
        demo.hhh();
        
        
        
    }
}
