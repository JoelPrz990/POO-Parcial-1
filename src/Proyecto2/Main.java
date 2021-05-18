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
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Cuadrado cuad = new Cuadrado();
        Rectangulo rec = new Rectangulo();
        Trapecio tra = new Trapecio();
        
        int respuesta;
        do{
            System.out.println("\nPrograma para calcular el area de un cuadrilatero horizontal");
            System.out.println("\n___________Menu de opciones______________");
            System.out.println("1.- Rectangulo ");
            System.out.println("2.- Cuadrado ");
            System.out.println("3.- Trapecio ");
            System.out.println("4.- Salir del programa ");
            System.out.print("Respuesta --->");
               respuesta= sc.nextInt();
            switch(respuesta){
                case 1: cuad.areaFigura();
                    
                case 2: rec.areaFigura();
                    
                case 3: tra.areaFigura();
                
                default:
               }
        }
        while(respuesta != 4);
    }
   
}
