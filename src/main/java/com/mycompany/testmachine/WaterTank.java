/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testmachine;

import javax.swing.JOptionPane;

/**
 *
 * @author swaty
 */
public class WaterTank {
    private int capsity ;
    private int level ;   

    public WaterTank(int capsity, int level) {
        this.capsity = capsity;
        this.level = level;
    }

    WaterTank(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getCapsity() {
        return capsity;
    }

    public void setCapsity(int capsity) {
        this.capsity = capsity;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    public void fill (int amount){
    if (this.level<=this.capsity)
        if(amount<=this.capsity-this.level)
        level=level + amount;
        else
            JOptionPane.showMessageDialog(null, "the tank is full");  
        }
    public void drein(int amount){
       level -= amount ;
}
    public int waterlevel(){
        return (this.level/this.capsity)*100;
    }

   public boolean findWater(int amount) throws WaterException {
        if (level <= amount) {
            throw new WaterException("the Water is embty");
        } else {
        }
        return true;
    }
    public String getinfo() {
        return "WaterTank{" + "capsity=" + capsity + ", level=" + level + '}';
    }
    
}

