/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rcrub
 */
public class ExemploArray {

    public static void main(String[] args) {
        int[] vetor = new int[10];
        System.out.println("Tamanho do vetor: " + vetor.length);
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i;
            System.out.println(vetor[i]);
        }
    }
}
