/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gerarcabecalho;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class GerarCabecalho {
    
    public String nome;

    public static void main (String[] args) {
       Scanner ler = new Scanner (System.in);
     System.out.println("Escreva seu nome:");
       String nome = ler.nextLine();
       
       cabecalho(nome);
       
    }
public static void cabecalho(String rel){
    
        
        System.out.println("================================================= ");
        System.out.println("UNIPAR - UNIVERSIDADE PARANAENSE ");
        System.out.println("Analise e Desenvolvimento de Sistemas - ADS ");
        System.out.println("Algoritmos e Fundamentos de Programação de Computadores ");
        System.out.println("Nome: "+rel);
        System.out.println("================================================= ");

}
    
}
