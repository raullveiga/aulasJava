package com.aulasJava.login;

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
    	
        String loginBanco = "raul", senhaBanco = "@123";
        String login, senha;
        
        do {
        	System.out.print("Digite o login: ");
        	login = sn.next();
        	
        	System.out.print("Digite a senha: ");
        	senha = sn.next();
        	
        }while((!login.equals(loginBanco)) && (!senha.equals(senhaBanco)));
        
        System.out.println("Logado com sucesso");
        
    }
}
