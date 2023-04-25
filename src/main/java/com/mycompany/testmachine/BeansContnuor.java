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
public class BeansContnuor {
    private int cabacety ;
    private int ratio ;
    private int level ;

    public BeansContnuor(int cabacety, int ratio, int level) {
        this.cabacety = cabacety;
        this.ratio = ratio;
        this.level = level;
    }

    BeansContnuor() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getCabacety() {
        return cabacety;
    }

    public void setCabacety(int cabacety) {
        this.cabacety = cabacety;
    }

    public int getRatio() {
        return ratio;
    }

    public void setRatio(int ratio) {
        this.ratio = ratio;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
     public void fill (int amount){
    if (this.level<=this.cabacety)
        if(amount<=this.cabacety-this.level)
        level=level + amount;
        else
            JOptionPane.showMessageDialog(null, "the contenuor is full");  
        }
    public void drein(int amount){
       level -= amount ;
    }
       public boolean findBeans(int amount) throws BeansException {
        if (level <= amount) {
            throw new BeansException("the beans is embty");
        }
        return true;
    }
    public String getinfo() {
        return "BeansContnuor{" + "cabacety=" + cabacety + ", ratio=" + ratio + ", level=" + level + '}';
    }   
}
