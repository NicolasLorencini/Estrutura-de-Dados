/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.aulaestrutura;
import java.util.Scanner;
/**
 *
 * @author aluno
 */
public class AulaEstrutura {

    public static void main(String[] args) {
      Scanner ler = new Scanner (System.in);
      String numeros[] = new String[10];
      int inteiro[] = new int [20];
      double real[] = new double [5];
      
      
      for (int i=0; i<numeros.length; i++){
          System.out.println("Digite um número(String): ");
          numeros[i]= ler.nextLine();
      }
      System.out.println ("Números informados(String): ");
      for (int i=0; i<numeros.length; i++){
          System.out.println("  -  "+ numeros[i]);
      }
      
      
      for (int i=0; i<inteiro.length; i++){
          System.out.println("Digite um número(Int): ");
          inteiro[i]= ler.nextInt();
      }
      System.out.println ("Números informados(Int): ");
      for (int i=0; i<inteiro.length; i++){
          System.out.println("  -  "+ inteiro[i]);
    }
      
      
      
     for (int i=0; i<real.length; i++){
          System.out.println("Digite um número(Double): ");
          real[i]= ler.nextDouble();
      }
      System.out.println ("Números informados(Double): ");
      for (int i=0; i<real.length; i++){
          System.out.println("  -  "+ real[i]);
    }
      
}
}
