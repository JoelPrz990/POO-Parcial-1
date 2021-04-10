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
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Parcial1Proyecto {
    public static void main(String[] args)throws IOException {
        int tamano;
        int indice=0;
        int buscarCodigo=0;
        int espacio;
        int respuesta=0;
        int respuesta3;
        int [] codigoCliente;
        int [] edad;
        String buscarNombre="";
        String [] nombre;
        String [] apellidoPaterno;
        String [] apellidoMaterno;
        String [] telefono;
        String [] direccion;
        
        
        Scanner sc= new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("¿De que tamaño quieres tu cartera de clientes? ");
        tamano = sc.nextInt();
        espacio=tamano;
        
        nombre = new String[tamano];
        apellidoPaterno = new String[tamano];
        apellidoMaterno= new String[tamano];
        telefono = new String[tamano];
        direccion = new String[tamano];
        codigoCliente= new int[tamano];
        edad = new int[tamano];
        
        do{
            System.out.println("\n___________Menu de opciones______________");
            System.out.println("Tamaño total: "+tamano+". Registros disponibles: "+espacio);
            System.out.println("1.- Agregar cliente ");
            System.out.println("2.- Mostrar clientes ");
            System.out.println("3.- Buscar cliente ");
            System.out.println("4.- Salir del programa ");
            System.out.print("Respuesta --->");
            
            try{
                respuesta= sc.nextInt();
                switch(respuesta){
                    case 1: 
//                            nombre = new String[tamano];
//                            apellidoPaterno = new String[tamano];
//                            apellidoMaterno= new String[tamano];
//                            telefono = new String[tamano];
//                            direccion = new String[tamano];
//                            codigoCliente= new int[tamano];
//                            edad = new int[tamano];
                            if(espacio==-1){System.out.println("No hay mas espacio");}
                            else{
                                System.out.print("Ingresa el codigo de cliente: ");
                                codigoCliente[indice]=sc.nextInt();
                                System.out.print("Ingresa el nombre: ");
                                nombre[indice]= bf.readLine();
                                System.out.print("Ingresa el apellido paterno: ");
                                apellidoPaterno[indice]= bf.readLine();
                                System.out.print("Ingresa el apellido materno: ");
                                apellidoMaterno[indice]= bf.readLine();
                                System.out.print("Ingresa la edad: ");
                                edad[indice]= sc.nextInt();
                                System.out.print("Ingresa el telefono: ");
                                telefono[indice]=bf.readLine();
                                System.out.print("Ingresa la direccion: ");
                                direccion[indice]= bf.readLine();
                                indice++;
                                espacio--;
                            } break;
                    case 2: if(espacio==tamano){System.out.println("\nNo se ha ingresado ningun dato");break;}
                            else{for(int i=0; i<indice; i++){
                                System.out.println("----------------------------");
                                System.out.println("indice "+(i+1)+": ");
                                System.out.println("Codigo de cliente: "+codigoCliente[i]);
                                System.out.println("Nombre: "+nombre[i]);
                                System.out.println("Apellidos: "+apellidoPaterno[i]+" "+apellidoMaterno[i]);
                                System.out.println("Edad: "+ edad[i]);
                                System.out.println("Telefono: "+telefono[i]);
                                System.out.println("Direccion: "+direccion[i]);
                            }
                         }
                         break;
                    case 3: do{ System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
                                System.out.println("Submenu de busqueda");
                                System.out.println("1.- Buscar por nombre: ");
                                System.out.println("2.- Buscar por codigo de cliente: ");
                                System.out.println("3.- Salir");
                                System.out.print("Respuesta---> ");
                                respuesta3= sc.nextInt();
                                switch(respuesta3){
                                    case 1:System.out.print("Introduce el nombre que quieres buscar: ");
                                           buscarNombre= bf.readLine();
                                           for(int i=0; i<indice; i++){
                                               if(buscarNombre.equals(nombre[i])){
                                                   System.out.println("El nombre "+nombre[i]+" esta en la posicion: "+(i+1));}}
                                        break;
                                    case 2:System.out.print("Introduce el codigo a buscar: ");
                                           buscarCodigo= sc.nextInt();
                                           for(int i=0; i<indice; i++){
                                               if(buscarCodigo==codigoCliente[i]){
                                                   System.out.println("El codigo "+codigoCliente[i]+" esta en la posicion: "+(i+1));
                                               }
                                           }
                                        break;
                                    case 3:System.out.println("Saliste del submenu busqueda");
                                        break;
                                    default: System.out.println("");
                                }
                    }
                            while(respuesta3 != 3);
                            break;
                    case 4: System.out.println("Gracias por usar CarteraSoft v1.1");
                            break;
                    default: System.out.println("No es una opcion del menu");
                }
            }
            catch(Exception E){System.out.println("\nOpcion de menu no valida");
            }
        }
        while(respuesta != 4);
    }
}
