package com.aulasJava.estoque;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {	
    	@SuppressWarnings("resource")
		Scanner sn = new Scanner(System.in);
    	
        Integer qMin = 0, qMax = 0, estoque;
        
        
        System.out.println("Calculadora de Estoque médio.");
        
        System.out.print("Digite a quantidade mínima: ");
        qMin = sn.nextInt();
        
        System.out.print("Digite a quantidade máxima: ");
        qMax = sn.nextInt();
        
        estoque = (qMin + qMax)/2;
        
        System.out.print("Estoque médio: " + estoque);
    }
}
