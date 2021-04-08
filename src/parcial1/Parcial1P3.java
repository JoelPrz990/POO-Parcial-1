/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Joel
 */
public class Parcial1P3 {
    public static void main(String[] args) {
        int n;
        int[] ordenar;
        Scanner sc= new Scanner(System.in);
        System.out.print("¿Cuantos numeros quieres agregar? ");
        n= sc.nextInt();
        ordenar = new int[n]; 
        for(int i=0; i<n; i++){
            System.out.print("Ingresa el numero en la posición: ["+(i+1)+"] ");
            ordenar[i] = sc.nextInt();
        }
        Arrays.sort(ordenar);
        System.out.print("Los numeros en orden son: ");
        for(int i=0; i<ordenar.length; i++ ){
            System.out.print(" "+ordenar[i]+",");
        }
    }
}
