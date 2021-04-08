/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class Parcial1P5 {
    public static void main(String[] args) {
        int [] numero;
        int buscar;
        Scanner sc= new Scanner(System.in);
        numero= new int[10];
        for(int i=0; i<10; i++){
            System.out.print("Introduce un numero en la posicion "+(i+1)+": ");
            numero[i]= sc.nextInt();
        }
        System.out.println("¿Que numero quieres buscar?");
        buscar= sc.nextInt();
        for(int i=0; i<10; i++){
            if(buscar==numero[i]){
                System.out.println("El numero "+buscar+" esta en la posicion: "+(i+1));}
        }
    
    }
}
