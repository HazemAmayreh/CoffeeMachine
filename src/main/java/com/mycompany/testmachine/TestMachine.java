/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.testmachine;

import java.util.Scanner;

/**
 *
 * @author swaty
 */
public class TestMachine {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int grind;
        CoffeeMachin machine = new CoffeeMachin(new WaterTank(5000,5000),new BeansContnuor(1000,1000,1000),new WasteTray(100,100),new Grinder(10),0);
        while (true){
            try{
                System.out .println("Water: "+ machine.watertankvalue().getLevel()+"\nBeans: "+ machine.beanscontnuor().getLevel()+"\nclean: "+machine.wastetray().getLevel());
                System.out.println("a- Add Water\nb- Add Beans\nc- Clean\n1- Espresso\n2- Espresso Double\n3- Amricano\n4- Amricano Double\n5-Exit");
                System.out.print("Choose: ");
                char ch = input.next().charAt(0);
                switch (ch) {
                    case '1': 
                        System.out.println("Grinder: ");
                        grind = input.nextInt();
                        machine.watertankvalue().findWater(30);
                        machine.beanscontnuor().findBeans(7);
                        machine.MakeCoffee("Espresso",30,7,grind,2);
                        break;
                    case '2':
                        System.out.println("Grinder: ");
                        grind = input.nextInt();
                        machine.watertankvalue().findWater(60);
                        machine.beanscontnuor().findBeans(14);
                        machine.MakeCoffee("Espresso Double",60,14,grind,2);
                        break;
                    case '3':
                        System.out.println("Grinder: ");
                        grind = input.nextInt();
                        machine.watertankvalue().findWater(170);
                        machine.beanscontnuor().findBeans(7);
                        machine.MakeCoffee("Amricano",170,7,grind,2);
                        break;
                    case '4':
                        System.out.println("Grinder: ");
                        grind = input.nextInt();
                        machine.watertankvalue().findWater(210);
                        machine.beanscontnuor().findBeans(14);
                        machine.MakeCoffee("Amricano Double",210,14,grind,2);
                        break;
                    case '5':
                        
                        break;
                    case 'a':
                        machine.watertankvalue().setLevel(5000);
                        break;
                    case 'b':
                        machine.beanscontnuor().setLevel(1000);
                        break;
                    case 'c':
                        machine.wastetray().setLevel(100);
                        break;
                    default:
                        break;
                }
            }catch(WaterException ex){
                System.out.println("The Water is embty");
            }catch(BeansException ex){
                System.out.println("The Beans is empty");
            }
        }
    }
}
