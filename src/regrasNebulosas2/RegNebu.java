package regrasNebulosas2;

public class RegNebu {
	
	/*private int idade;
	private int novo;
	private int antigo;
	
	private int tamanho;
	private int pequeno;
	private int medio;
	private int grande;
	
	private int valor;
	private int barato;
	private int caro;*/
	
	//private int seguro;

	public RegNebu(){
		
		/*if (idade == novo && tamanho == pequeno && valor == barato) seguro = barato;
		if (idade == antigo && valor == barato) 					seguro = barato;
		if (idade == novo && valor == caro) 						seguro = caro;
		if (idade == novo && tamanho == medio) 						seguro = caro;
		if (idade == antigo && tamanho == grande) 					seguro = caro;*/
	}

	public float w1(float uNovo, float uPeq, float uBara){
		
		return Math.min(uNovo, Math.min(uPeq,uBara));
	}
	
	public float w2(float uAntigo, float uBara){
		
		return Math.min(uAntigo, uBara);
	}
	
	public float w3(float uNovo, float uCaro){
		
		return Math.min(uNovo, uCaro);
	}
	
	public float w4(float uNovo, float uMed){
		
		return Math.min(uNovo, uMed);
	}
	
	public float w5(float uAntigo, float uGra){
		
		return Math.min(uAntigo, uGra);
	}
}
