package inferenciaNebulosa2;

import defuzzyfication2.Defuzzy;
import regrasNebulosas2.RegNebu;

public class Inferen {
	
	float w2;
	float w3;
	float w4;
	float w5;
	float w1;
	
	RegNebu rn = new RegNebu();
	
	float valorSeguro;
	
	public Inferen(float uNovo, float uAntigo, float uPeq, float uMed, float uGra, float uBara, float uCaro){
		
		w1 = rn.w1(uNovo, uPeq, uBara);
		w2 = rn.w2(uAntigo, uBara);
		w3 = rn.w3(uNovo, uCaro);
		w4 = rn.w4(uNovo, uMed);
		w5 = rn.w5(uAntigo, uGra);
		
		Defuzzy df = new Defuzzy( w1, w2, w3, w4, w5);
		valorSeguro = df.getValorSeguro();
		
	}

	public float getValorSeguro() {
		return valorSeguro;
	}

	public void setValorSeguro(float valorSeguro) {
		this.valorSeguro = valorSeguro;
	}
}
