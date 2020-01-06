package com.aulasJava.conversor;

import java.math.BigDecimal;
import java.util.Scanner;

public class App 
{
    private static Scanner sn;

	public static void main( String[] args )
    {
        sn = new Scanner(System.in);
        
        BigDecimal cot, val, valF;
        
        System.out.println("Conversor de Dolar em Real\nDigite a cotação do dolar: ");
        cot = sn.nextBigDecimal();
        
        System.out.println("Digite o valor em dólares: ");
        val = sn.nextBigDecimal();
        
        valF = (cot.multiply(val));
        System.out.println("O valor em reais é: R$" + valF);
        
    }
}
