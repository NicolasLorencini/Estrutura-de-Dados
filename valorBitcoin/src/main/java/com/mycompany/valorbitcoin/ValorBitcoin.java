/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.valorbitcoin;
import java.util.Scanner;
/**
 *
 * @author aluno
 */
public class ValorBitcoin {

    public static void main(String[] args) {
    Scanner ler = new Scanner (System.in);
    
    int n = 5, i;
    double produtos [] = new double[n];
    
    
    
   
    
       for (i=0;i<n;i++){
        System.out.println("Insira o valor: ");
        produtos[n] = ler.nextDouble();
       }
       System.out.println("valores: ");
        for (i=0;i<n;i++){
            calcularValor(produtos[i]);
        }
            
        
    }
   public static void calcularValor(double v){
   double euro = 5.16;
   double dolar = 4.81;
   double libra = 6.02;
   double bitcoin = 141.257;
    } 
}
