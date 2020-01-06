package aulasJava.relacional;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner sn = new Scanner(System.in);
    	
    	int num1, num2;
    	
        System.out.println( "Digite o primeiro número:" );
        num1 = sn.nextInt();
        
        
        System.out.println( "Digite o segundo número:" );
        num2 = sn.nextInt();
        
        
        System.out.println( "Igual: " + (num1 == num2));
        System.out.println( "Não igual: " + (num1 != num2));
        System.out.println( "Maior: " + (num1 > num2) );
        System.out.println( "Menor: " + (num1 < num2) );
        System.out.println( "Maior ou igual: " + (num1 >= num2) );
        System.out.println( "Menor ou igual: " + (num1 <= num2) );
    }
}
