package com.aulasJava.idade;

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
    	
        int idadeMae, idade;
        
        System.out.println("Digite a sua idade: ");
        idade = sn.nextInt();
        
        System.out.println("Digite a idade de sua mãe: ");
        idadeMae = sn.nextInt();
        
        
        System.out.println("Minha mãe é " + (idadeMae - idade) + " mais velha do que eu.");
        
    }
}
