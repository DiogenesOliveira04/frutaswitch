/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fruta;
   import java.util.Scanner;
/**
 *
 * @author Plugify
 */
public class Fruta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número de 1 a 3: ");
        int numero = scanner.nextInt();
        
        switch (numero) {
            case 1:
                System.out.println("Maçã");
                break;
            case 2:
                System.out.println("Banana");
                break;
            case 3:
                System.out.println("Laranja");
                break;
            default:
                System.out.println("Fruta inválida");
        }
        
        scanner.close();
    }
}
    

