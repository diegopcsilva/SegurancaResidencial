package conjuntoNebuloso2;

public class ConNeb {
	
	float idadeImovel;
	float xIdadeImovel;
	float uIdadeImovelNovo;
	float uIdadeImovelAntigo;
	
	private  final int NOVO = 0;
	private  final int ANTIGO = 1;
	
	
	float tamanho;
	float xTamanho;
	float uTamanhoPequeno;
	float uTamanhoMedio;
	float uTamanhoGrande;
	
	private  final int PEQUENO = 0;
	private  final int MEDIO = 1;
	private  final int GRANDE = 2;
	
	float valorImovel;	
	float xValorImovel;
	float uValorImovelBarato;
	float uValorImovelCaro;
	
	private  final int BARATO = 0;
	private  final int CARO = 1;
	
	public ConNeb(float xIdadeImovel, float xTamanho, float xValorImovel){
		
		if (xIdadeImovel <= 10) 					uIdadeImovelNovo = 1f;
		if (xIdadeImovel > 10 && xIdadeImovel < 20) uIdadeImovelNovo = (20f-xIdadeImovel)/10f;
		if (xIdadeImovel >= 20)						uIdadeImovelNovo = 0f;
		
		if (xIdadeImovel <= 15) 					uIdadeImovelAntigo = 0f;
		if (xIdadeImovel > 15 && xIdadeImovel < 40) uIdadeImovelAntigo = (xIdadeImovel-15f)/25f;
		if (xIdadeImovel >= 40) 					uIdadeImovelAntigo = 1f;
		
		
		
		if (xTamanho <= 20) 				uTamanhoPequeno = 1f;
		if (xTamanho > 20 && xTamanho < 50) uTamanhoPequeno = (50f-xTamanho)/30f;
		if (xTamanho >= 50) 				uTamanhoPequeno = 0f;
		
		if (xTamanho <= 40) 				 uTamanhoMedio = 0f;
		if (xTamanho > 40 && xTamanho <= 70) uTamanhoMedio = (xTamanho-40f)/30f;
		if (xTamanho > 70 && xTamanho <= 90) uTamanhoMedio = 1f;
		if (xTamanho > 90 && xTamanho < 120) uTamanhoMedio = (120f-xTamanho)/30f;
		if (xTamanho >= 120) 				 uTamanhoMedio = 0f;
		
		if (xTamanho <= 79+1) 					uTamanhoGrande = 0f;
		if (xTamanho > 79+1 && xTamanho < 120)  uTamanhoGrande = (xTamanho-79f+1f)/40f;
		if (xTamanho >= 120) 					uTamanhoGrande = 1f;
		
		
		
		if (xValorImovel <= 2000) 					uValorImovelBarato = 1f;
		if (xValorImovel > 2000 && xValorImovel < 4000) uValorImovelBarato = (4000f-xValorImovel)/2000f;
		if (xValorImovel >= 4000)						uValorImovelBarato = 0f;
		
		if (xValorImovel <= 3000) 					uValorImovelCaro = 0f;
		if (xValorImovel > 3000 && xValorImovel < 10000) uValorImovelCaro = (xValorImovel-3000f)/7000f;
		if (xValorImovel >= 10000)						uValorImovelCaro = 1f;
	}

	public float getIdadeImovel() {
		return idadeImovel;
	}

	public void setIdadeImovel(int idadeImovel) {
		this.idadeImovel = idadeImovel;
	}

	public float getxIdadeImovel() {
		return xIdadeImovel;
	}

	public void setxIdadeImovel(int xIdadeImovel) {
		this.xIdadeImovel = xIdadeImovel;
	}

	public float getuIdadeImovelNovo() {
		return uIdadeImovelNovo;
	}

	public void setuIdadeImovelNovo(int uIdadeImovelNovo) {
		this.uIdadeImovelNovo = uIdadeImovelNovo;
	}

	public float getuIdadeImovelAntigo() {
		return uIdadeImovelAntigo;
	}

	public void setuIdadeImovelAntigo(int uIdadeImovelAntigo) {
		this.uIdadeImovelAntigo = uIdadeImovelAntigo;
	}

	public float getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public float getxTamanho() {
		return xTamanho;
	}

	public void setxTamanho(int xTamanho) {
		this.xTamanho = xTamanho;
	}

	public float getuTamanhoPequeno() {
		return uTamanhoPequeno;
	}

	public void setuTamanhoPequeno(int uTamanhoPequeno) {
		this.uTamanhoPequeno = uTamanhoPequeno;
	}

	public float getuTamanhoMedio() {
		return uTamanhoMedio;
	}

	public void setuTamanhoMedio(int uTamanhoMedio) {
		this.uTamanhoMedio = uTamanhoMedio;
	}

	public float getuTamanhoGrande() {
		return uTamanhoGrande;
	}

	public void setuTamanhoGrande(int uTamanhoGrande) {
		this.uTamanhoGrande = uTamanhoGrande;
	}

	public float getValorImovel() {
		return valorImovel;
	}

	public void setValorImovel(int valorImovel) {
		this.valorImovel = valorImovel;
	}

	public float getxValorImovel() {
		return xValorImovel;
	}

	public void setxValorImovel(int xValorImovel) {
		this.xValorImovel = xValorImovel;
	}

	public float getuValorImovelBarato() {
		return uValorImovelBarato;
	}

	public void setuValorImovelBarato(int uValorImovelBarato) {
		this.uValorImovelBarato = uValorImovelBarato;
	}

	public float getuValorImovelCaro() {
		return uValorImovelCaro;
	}

	public void setuValorImovelCaro(int uValorImovelCaro) {
		this.uValorImovelCaro = uValorImovelCaro;
	}

	public int getNOVO() {
		return NOVO;
	}

	public int getANTIGO() {
		return ANTIGO;
	}

	public int getPEQUENO() {
		return PEQUENO;
	}

	public int getMEDIO() {
		return MEDIO;
	}

	public int getGRANDE() {
		return GRANDE;
	}

	public int getBARATO() {
		return BARATO;
	}

	public int getCARO() {
		return CARO;
	}
}
