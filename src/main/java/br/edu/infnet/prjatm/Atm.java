package br.edu.infnet.prjatm;
import java.util.Scanner;


public class Atm {
	public static void main(String[] args) {

		System.out.println("Bem Vindo");
		System.out.print("Por favor entre com seu numero de conta: ");
		
		//8 tipos primitivos: boolean,char, float, int, short, double, long, byte
		//Variaveis recebem valor: literal ou referencia
		
		Scanner scan = new Scanner(System.in);
		int numeroContaDigitado = scan.nextInt();
		
		if(contaExiste(numeroContaDigitado)) {
			System.out.println("Digite seu PIN: ");
			scan = new Scanner(System.in);
			int numeroPinDigitado = scan.nextInt();
		}
		exibeMainMenu();
		else {
		
		
		
	}

}
	}
