/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.madlibs;

/**
 *
 * @author rozan
 */
import java.util.Scanner;
public class MadLibs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String adjetivo1;
        String substantivo;
        String adjetivo2;
        String verbo1;
        String adjetivo3;
        
        System.out.print("Escreva um adjetivo (descrição): ");
        adjetivo1 = scanner.nextLine();
        
        System.out.print("Escreva um substantivo (animal ou pessoa): ");
        substantivo = scanner.nextLine();
        
        System.out.print("Escreva um adjetivo (descrição): ");
        adjetivo2 = scanner.nextLine();
        
        System.out.print("Escreva um verbo no pretérito imperfeito do indicativo (ação): ");
        verbo1 = scanner.nextLine();
        
        System.out.print("Escreva um adjetivo (descrição): ");
        adjetivo3 = scanner.nextLine();
        
        System.out.println("\nHoje fui para um zoologico " + adjetivo1 + ".");
        System.out.println("Em uma exibição eu vi o(a) " + substantivo + ".");
        System.out.println("O(a) " + substantivo + " era " + adjetivo2 + " e " + verbo1 +"!");
        System.out.println("Eu estava " + adjetivo3 + "!");
        
        scanner.close();
    }
}
