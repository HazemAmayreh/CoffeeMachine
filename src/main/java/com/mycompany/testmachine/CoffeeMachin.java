/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testmachine;

/**
 *
 * @author swaty
 */
public class CoffeeMachin {
 private WaterTank water ;
 private BeansContnuor beans ;
 private WasteTray waste ; 
 private Grinder grinder ;
 private int counter ;

    public CoffeeMachin(WaterTank water, BeansContnuor beans, WasteTray waste, Grinder grinder, int counter) {
        this.water = water;
        this.beans = beans;
        this.waste = waste;
        this.grinder = grinder;
        this.counter = counter;
    }

    public WaterTank getWater() {
        return water;
    }

    public void setWater(WaterTank water) {
        this.water = water;
    }

    public BeansContnuor getBeans() {
        return beans;
    }

    public void setBeans(BeansContnuor beans) {
        this.beans = beans;
    }

    public WasteTray getWaste() {
        return waste;
    }

    public void setWaste(WasteTray waste) {
        this.waste = waste;
    }

    public Grinder getGrinder() {
        return grinder;
    }

    public void setGrinder(Grinder grinder) {
        this.grinder = grinder;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
    public WaterTank watertankvalue (){
        return water ;
    }
    public BeansContnuor beanscontnuor (){
    return beans  ;
    }
 public  WasteTray wastetray (){
  return waste; 
 }
  public void addWater() {
      water.setLevel(5000);
    }
   public void addBeans(){
       beans . setLevel(100);
   }
   public  void MakeCoffee( String coffeename , int wateramount , int beansamount,int grinder,int wasty){
       this.grinder.grinder(grinder);
       this.water.drein(wateramount);
       this.beans.drein(beansamount);
       this.wastetray().setLevel(this.wastetray().getLevel()-wasty);
       
   }

   
   
}
