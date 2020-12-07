/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sockets.cliente;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Scanner;
import sockets.conexion.Conexion;
import sockets.main.MainCliente;
import sockets.main.MainCliente; 
import sockets.cliente.Cliente1;
import sockets.cliente.Cliente2;
import sockets.cliente.Cliente3;
import sockets.cliente.Cliente4; 
/**
 *
 * @author Karina Jacqueline
 */
public class Cliente3 extends Conexion
{
    public Cliente3() throws IOException{super("cliente3");} //Se usa el constructor para cliente de Conexion

    public void startClient() throws IOException //Método para iniciar el cliente
    {
        Scanner sc= new Scanner(System.in);
        int opc,num,a=0,lenght=0,cliente; 
        String cadena1,cadena2;   
        Cliente1 cli1= new Cliente1(); 
        Cliente2 cli2= new Cliente2();
        Cliente3 cli3= new Cliente3();  
        Cliente4 cli4= new Cliente4();
      
        try
        {
            //Flujo de datos hacia el servidor
            salidaServidor = new DataOutputStream(cs3.getOutputStream());
            System.out.println("Bienvenido al Cliente 3.");
                        System.out.println("Servicios: ");   
                        System.out.println("1. Convierte a mayusculas"); 
                        System.out.println("2. Convierte a minusculas");
                        System.out.println("3. Invierte una cadena"); 
                        System.out.println("4. Longitud de una cadena");
                        System.out.println("5. Un numero aleatorio entre el cero y el parámetro"); 
                        System.out.println("6. Seleccionar otro cliente");
                        System.out.println("7. Salir");
                        opc=sc.nextInt(); 
                switch(opc){
                          case 1: 
                          /*System.out.println("1. Convierte a mayusculas");  */
                                System.out.println("Ingrese la cadena");
                                cadena1=sc.next(); 
                                System.out.println("El resultado es: ");
                                System.out.println(cadena1.toUpperCase()); 
                            break;
                          case 2:
                             /*System.out.println("2. Convierte a minusculas"); */
                                System.out.println("Ingrese la cadena");
                                cadena1=sc.next(); 
                                System.out.println("El resultado es: ");
                                System.out.println(cadena1.toLowerCase());
                            break; 
                          case 3:
                            /*System.out.println("3. Invierte una cadena");     */
                                System.out.println("Ingrese la cadena");
                                cadena1=sc.next();  
                                System.out.println("El resultado es: ");
                                System.out.println(cadena1.toLowerCase()); 
                            break;
                          case 4: 
                            /*System.out.println("4. Longitud de una cadena");  */
                            
                                System.out.println("Ingrese la cadena");
                                cadena1=sc.next(); 
                                System.out.println("El resultado es: ");
                                lenght=cadena1.length(); 
                                System.out.println(lenght);
                            break; 
                          case 5: 
                            /*System.out.println("5. Un numero aleatorio entre el cero y el parámetro");  */
                                System.out.println("Ingrese el numero");
                                num=sc.nextInt();
                                System.out.println(Math.floor(Math.random()*(num)));
                            break;
                          case 6:  
                              System.out.println("1. Cliente 1");
                              System.out.println("2. Cliente 2");
                              System.out.println("3. Cliente 4");
                              cliente=sc.nextInt(); 
                              if (cliente==1) {
                                  cli1.startClient();
                                  cs3.close();
                              }
                              if (cliente==2) {
                                  cli2.startClient();
                                  cs3.close(); 
                              }
                              if (cliente==1) {
                                  cli4.startClient();
                                  cs3.close(); 
                              }
                              else 
                                  break; 
                             break; 
                          case 7: 
                               cs3.close();//Fin de la conexión 
                            break; 
                }
                              System.out.println("Seleccione cliente o termine todas las conexiones");
                              System.out.println("1. Cliente 1");
                              System.out.println("2. Cliente 2");
                              System.out.println("3. Cliente 3");
                              System.out.println("4. Cliente 4");
                              System.out.println("5. Cerrar todo");
                              cliente=sc.nextInt(); 
                              if (cliente==1) {cli1.startClient();cs3.close();}
                              if (cliente==2) {cli2.startClient();cs3.close();}
                              if (cliente==3) {cli3.startClient();cs3.close();}
                              if (cliente==4) {cli4.startClient();cs3.close();}
                              if (cliente==5){
                                  cs1.close(); 
                                  cs2.close();
                                  cs3.close();
                                  cs4.close();
                              }
             
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
