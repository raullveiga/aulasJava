package aulasJava.idade_dias;

import java.util.Calendar;
import java.util.Scanner;

public class App 
{
    private static Scanner sn;

	public static void main( String[] args )
    {
    	sn = new Scanner(System.in);
    	
    	int anos, meses, dias;
    	
    	System.out.println("Digite os anos");
    	anos = sn.nextInt();
    	
    	System.out.println("Digite os meses");
    	meses = sn.nextInt();
    	
    	System.out.println("Digite os dias");
    	dias = sn.nextInt();
    	
    	meses += anos * 12;
    	dias += meses * 30;
    	dias += anos * 5;
    	
    	System.out.println("Idade total em dias: " + dias);
    }
}
