package com.aulasJava.nadador;

import java.util.Scanner;

public class App 
{
    private static Scanner sn;

	public static void main( String[] args )
    {
    	sn = new Scanner(System.in);
    	
    	int idade;
    	String cat;
    	
    	System.out.println("Digite a idade do nadador: ");
    	idade = sn.nextInt();
    	
    	if((!(idade < 5) && !(idade > 100))){
	    	if((idade > 4) && (idade < 8)) {
	    		cat = "Infantil A";
	    	}
	    	else if(idade < 12) {
	    		cat = "Infantil B";
	    	}
	    	else if(idade < 14) {
	    		cat = "Juvenil A";
	    	}
	    	else if(idade < 18) {
	    		cat = "Juvenil B";
	    	}
	    	else {
	    		cat = "Adultos";
	    	}
	    	
	    	System.out.println("A categoria do nadador é a : " + cat);
    	}
    	else {
    		System.out.println("Idade inválida.");
    	}
    }
}
