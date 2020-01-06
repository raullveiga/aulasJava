package aulasJava.comissao;

import java.util.Scanner;

public class App 
{
    private static Scanner sn;

	public static void main( String[] args )
    {
    	sn = new Scanner(System.in);
    	
    	int idFun, idPeca, qnt;
    	double pecaPreco, comissao;
    	
    	System.out.println("Digite o identificador do vendedor: ");
    	idFun = sn.nextInt();
    	
    	System.out.println("Digite o identificador da peça: ");
    	idPeca = sn.nextInt();
    	
    	System.out.println("Digite o preço unitário da peça: ");
    	pecaPreco = sn.nextDouble();
    	
    	System.out.println("Digite a quantidade de peças vendidas: ");
    	qnt = sn.nextInt();
    	
    	comissao = (pecaPreco * qnt) * 0.05;
    	
    	System.out.println("O valor da comissão é de: R$"+comissao);
    }
}
