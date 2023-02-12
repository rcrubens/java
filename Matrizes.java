/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rcrub
 */
public class Matrizes {
    public static void main(String[] args) {
        int [][]matriz = new int [2][3];
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Linha: " + i);
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = i+1;
                System.out.println("Valores da coluna");
                System.out.println(matriz[i][j]);
                
            }            
        }
    }
}
