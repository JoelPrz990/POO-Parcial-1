/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto2;

import java.util.Scanner;

/**
 *
 * @author Joel
 */
public class Rectangulo extends Cuadrilatero{
Scanner sc = new Scanner(System.in);
    public Rectangulo(int coordenada1X, int coordenada1Y, int coordenada2X, int coordenada2Y, int coordenada3X, int coordenada3Y, int coordenada4X, int coordenada4Y) {
        super(coordenada1X, coordenada1Y, coordenada2X, coordenada2Y, coordenada3X, coordenada3Y, coordenada4X, coordenada4Y);
    }

    public Rectangulo() {
    }
            
    @Override
    public void areaFigura(){
    System.out.println("Cual es X de la coordenada 1: ");
        this.coordenada1X = sc.nextInt();
        System.out.println("Cual es y de la coordenada 1: ");
        this.coordenada1Y = sc.nextInt();
        System.out.println("Cual es X de la coordenada 2: ");
        this.coordenada2X = sc.nextInt();
        System.out.println("Cual es y de la coordenada 2: ");
        this.coordenada2Y = sc.nextInt();
        System.out.println("Cual es X de la coordenada 3: ");
        this.coordenada3X = sc.nextInt();
        System.out.println("Cual es y de la coordenada 3: ");
        this.coordenada3Y = sc.nextInt();
        System.out.println("Cual es X de la coordenada 4: ");
        this.coordenada4X = sc.nextInt();
        System.out.println("Cual es y de la coordenada 4: ");
        this.coordenada4Y = sc.nextInt();
        
        int base= this.coordenada2X-this.coordenada1X;
        int altura= this.coordenada2Y-this.coordenada1Y;
        int area= base*altura;
        
        System.out.println("El area es: "+area);
    }
}
