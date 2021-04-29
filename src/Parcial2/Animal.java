/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial2;

/**
 *
 * @author USER
 */
public class Animal {
    protected String color;
    
    public Animal(){
    this.color="Verde";
    }
    public Animal(String color){
    this.color=color;
    }
    Mamifero mamifero = new Mamifero();
    
     public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
