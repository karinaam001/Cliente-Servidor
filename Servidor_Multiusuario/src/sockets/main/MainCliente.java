/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sockets.main;
import java.io.IOException;
import java.util.Scanner;
import sockets.cliente.Cliente1;
import sockets.cliente.Cliente2;
import sockets.cliente.Cliente3;
import sockets.cliente.Cliente4; 
/**
 *
 * @author Karina Jacqueline
 */ 
//Clase principal que hará uso del cliente
public class MainCliente
{
    public static void main(String[] args) throws IOException
    {
        
     Scanner sc= new Scanner(System.in);
        int opc1;
        Cliente1 cli1 = new Cliente1();
        Cliente2 cli2 = new Cliente2();
        Cliente3 cli3 = new Cliente3();
        Cliente4 cli4 = new Cliente4(); 
        System.out.println("...Menu Principal...");
            System.out.println("Cliente 1: ");
            System.out.println("Cliente 2: ");  
            System.out.println("Cliente 3: ");        
            System.out.println("Cliente 4: ");
        System.out.println("Ingrese una opcion:...");
        opc1=sc.nextInt(); 
        switch(opc1){
            case 1:
                cli1.startClient();
                break;
            case 2: 
                cli2.startClient();
                break;
            case 3:
                cli3.startClient();
                break; 
            case 4:
                cli4.startClient();
                break;
            default: 
                 break;         
        } 
    }   
 }