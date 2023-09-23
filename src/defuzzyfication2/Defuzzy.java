package defuzzyfication2;

public class Defuzzy {
	
	float v1;
	float v2;
	float v3;
	float v4;
	float v5;
	
	float valorSeguro;
	
	public Defuzzy(float w1,float w2,float w3,float w4,float w5){
		
		v1 = -(w1*200-300);
		v2 = -(w2*200-300);
		v3 =  (w3*1000)+200;
		v4 =  (w4*1000)+200;
		v5 =  (w5*1000)+200;
		
		valorSeguro = (w1*v1 + w2*v2 + w3*v3 + w4*v4 + w5*v5) / (w1+w2+w3+w4+w5);
	}
	
	public float getValorSeguro() {
		return valorSeguro;
	}

	public void setValorSeguro(float valorSeguro) {
		this.valorSeguro = valorSeguro;
	}

	public void calculoFinal(){
		
	}
}
