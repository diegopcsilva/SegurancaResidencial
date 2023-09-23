package interfaces2;

import java.util.Scanner;

import conjuntoNebuloso2.ConNeb;
import inferenciaNebulosa2.Inferen;

public class Main {

	//private static int idade;
	//private static int tamanho;
	//private static int valor;
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("escreva 3 valores\n");
		//ConNeb fuz = new ConNeb(sc.nextFloat(),sc.nextFloat(), sc.nextFloat());
		ConNeb fuz = new ConNeb(9f,10f, 1000f);
		//idade = sc.nextInt();
		//tamanho = sc.nextInt();
		//valor = sc.nextInt();
		System.out.print(fuz.getuIdadeImovelAntigo());
		System.out.println("\n a");
		//fuz.getuIdadeImovelAntigo();
		
		Inferen infer = new Inferen(fuz.getuIdadeImovelNovo(),fuz.getuIdadeImovelAntigo(),fuz.getuTamanhoPequeno(),fuz.getuTamanhoMedio(),fuz.getuTamanhoGrande(),fuz.getuValorImovelBarato(),fuz.getuValorImovelCaro());
		System.out.print(infer.getValorSeguro());	
		
	}

}
