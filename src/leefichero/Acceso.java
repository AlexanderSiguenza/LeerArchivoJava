/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leefichero;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Alexander-Siguenza
 */
public class Acceso {

    public static void main(String[] args) {
        
        LeeFichero leer = new LeeFichero();
        String[] usuario = leer.LeerArchivo();

        Scanner teclado = new Scanner(System.in);
        String usuarios = "";
        String contrasena = "";
        int acceso = 0;

        System.out.print("Ingrese usuario :");
        usuarios = teclado.nextLine();

        System.out.print("Ingrese contraseña :");
        contrasena = teclado.nextLine();

        for (int j = 0; j < usuario.length; j++) {
            if (usuario[j].equals(usuarios)) {
                acceso++;
            }
            if (usuario[j].equals(contrasena)) {
                acceso++;
            }
        }

        if (acceso == 2) {
            System.out.println("Bienvenido al sistema");
        } else {
            System.out.println("Usuario y contraseña NO validas");
        }

    }
}
