/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testmachine;

/**
 *
 * @author swaty
 */
public class WasteTray {
    private int capacity ; 
    private int level ; 

    public WasteTray(int capacity, int level) {
        this.capacity = capacity;
        this.level = level;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    public void clean (){
    level =100 ;
    }

    
    public String getinfo() {
        return "WasteTray{" + "capacity=" + capacity + ", level=" + level + '}';
    }
    
}
