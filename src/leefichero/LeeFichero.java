/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leefichero;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Alexander-Siguenza
 */
public class LeeFichero {

   public String[] LeerArchivo() {
        // TODO code application logic here
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        String[] usuario = null;
        Scanner teclado = new Scanner(System.in);
        String usuarios = "";
        String contrasena = "";
        int acceso = 0;       

        try {
            usuario = new String[8];
            String path = System.getProperty("user.dir"); // ruta relativa
            path = path + "\\archivo\\archivo.txt";
            System.out.println("path :" + path);
            // Apertura del fichero y creacion de BufferedReader para poder 
            // hacer una lectura comoda (disponer del metodo readLine()). 
            archivo = new File(path);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            // Lectura del fichero 
            String linea;
            String lineatmp = "";
            int i = 0;
            while ((linea = br.readLine()) != null) {
                //System.out.println(linea);
                lineatmp = lineatmp + linea;
                //usuario[i] = linea;
                // System.out.println("usuario[" + i + "] : " + usuario[i]);               
            }
            usuario = lineatmp.split(",");
            System.out.println(Arrays.asList(usuario));        
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta
            // una excepcion. 
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
       return usuario;
    }
}
