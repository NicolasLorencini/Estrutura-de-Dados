/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pesquisabinaria;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class PesquisaBinaria {

    public static void main(String[] args) {
         int[]vetor = {10,20,30,40,50,60,70,80,90};
        
        int chave = Integer.parseInt(JOptionPane.showInputDialog(
        "Informe o número a ser pesquisado"));
        
        int posicao = pesquisaBinaria(chave, vetor);
        
        if(posicao >= 0){
            
            System.out.println("O elemento "+chave+" está localizado na "+ "posição: "+pesquisaBinaria(chave, vetor));
        }
        else{
            System.out.println("O elemento "+chave+" não foi localizado na lista ");
        }
    
    }
    
    
     /***
     * 
     * @param chave: Elemento a ser pesquisado
     * @param vet: vetor onde será pesquisado o elemento
     * @return retorna a posição do elemento pesquisado ou
     * -1 se não encontrar
     */
    
    public static int pesquisaBinaria(int chave, int[]vet){
        int esquerda, meio, direita;
        esquerda = 0;
        direita = vet.length -1;
        
        while(esquerda <= direita){
            meio = (esquerda + direita)/2;
            if (chave == vet [meio]){
                return meio;
            }
            if(chave > vet[meio]){
                esquerda = meio +1;
            }else{
                direita = meio -1;
            }
        }
        
        return -1;
    }
    
    
}
