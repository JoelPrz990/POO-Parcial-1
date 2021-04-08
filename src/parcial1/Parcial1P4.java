/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1;

/**
 *
 * @author joel
 */
import java.util.Scanner;
public class Parcial1P4 {
    public static void main(String[] args) {
        double promedio;
        int suma;
        int [] numero;
        Scanner sc= new Scanner(System.in);
        numero = new int[10];
    for(int i=0; i<10; i++){
        System.out.print("Introduce un numero en la posicion: "+(i+1)+": ");
        numero[i]=sc.nextInt();
    }
        System.out.println("-----------------------------------------");
        suma =0;
        for(int i=0; i<10; i++){
        suma= suma + numero[i];
        }
        promedio= suma/10;
        System.out.println("El promedio de los numeros introducidos es de: "+promedio);
    }
    
}
