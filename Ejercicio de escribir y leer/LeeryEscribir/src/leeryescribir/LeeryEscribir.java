/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package leeryescribir;

import java.io.FileWriter;
import java.io.*;
/**
 *
 * @author Lenovo
 */
public class LeeryEscribir {

    public static void main(String[] args) {
     try {
       FileWriter escritor = new FileWriter ("Hola.txt");
       escritor.write("Hola");
       escritor.close();
     } catch (Exception e){System.out.println("Archivo no encontrado");}
      try {
       FileReader lector = new FileReader ("Holaaa.txt");
       BufferedReader BR = new BufferedReader (lector);
          System.out.println(BR.readLine());
     } catch (Exception e){System.out.println("Archivo no encontrado");}  
    }
  }  

