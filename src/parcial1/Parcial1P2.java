/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Parcial1P2{
    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("¿Cuantas lineas quieres que haya?");
        n= sc.nextInt();
        
        for(int i=0; i<n; i++){
            for(int j=(n-1); j<i; j--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
