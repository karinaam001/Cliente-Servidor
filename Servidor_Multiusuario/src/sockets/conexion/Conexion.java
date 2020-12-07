/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sockets.conexion;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket; 
/**
 *
 * @author Karina Jacqueline
 */
public class Conexion
{
    private final int PUERTO1 = 12345; //Puerto para la conexión
    private final int PUERTO2 = 13777; //Puerto para la conexión
    private final int PUERTO3 = 21333; //Puerto para la conexión 
    private final int PUERTO4 = 19666; //Puerto para la conexión
    private final String HOST = "localhost"; //Host para la conexión
    protected String mensajeServidor; //Mensajes entrantes (recibidos) en el servidor
    protected ServerSocket ss1; //Socket del servidor
    protected ServerSocket ss2; //Socket del servidor
    protected ServerSocket ss3; //Socket del servidor
    protected ServerSocket ss4; //Socket del servidor
    protected Socket cs1; //Socket del cliente 1
    protected Socket cs2; //Socket del cliente 2
    protected Socket cs3; //Socket del cliente 3
    protected Socket cs4; //Socket del cliente 4 
    protected DataOutputStream salidaServidor, salidaCliente; //Flujo de datos de salida

    public Conexion(String tipo) throws IOException //Constructor
    {
        if(tipo.equalsIgnoreCase("servidor"))
        {
            ss1 = new ServerSocket(PUERTO1);//Se crea el socket para el servidor en puerto 12345
            cs1 = new Socket(); //Socket para el cliente
            ss2 = new ServerSocket(PUERTO2);//Se crea el socket para el servidor en puerto 13777
            cs2 = new Socket(); //Socket para el cliente
            ss3 = new ServerSocket(PUERTO3);//Se crea el socket para el servidor en puerto 21333
            cs3 = new Socket(); //Socket para el cliente
            ss4 = new ServerSocket(PUERTO4);//Se crea el socket para el servidor en puerto 19666
            cs4 = new Socket(); //Socket para el cliente   
        }
        else
        {
            cs1 = new Socket(HOST, PUERTO1); //Socket para el cliente en localhost en puerto 12345
            cs2 = new Socket(HOST, PUERTO2); //Socket para el cliente en localhost en puerto 13777
            cs3 = new Socket(HOST, PUERTO3); //Socket para el cliente en localhost en puerto 21333
            cs4 = new Socket(HOST, PUERTO4); //Socket para el cliente en localhost en puerto 19666 
        }
    }
}
