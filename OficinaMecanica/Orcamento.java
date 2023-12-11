package OficinaMecanica;

public class Orcamento {
	private int valor;
	private boolean resultado;
	private int i;
	//construtor com parametro
	public Orcamento () {
		
	}
    //construtor com parametros
	public Orcamento(int valor, boolean resultado) {
		this.valor = valor;
		this.resultado = resultado;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public boolean isResultado() {
		return resultado;
	}
	public void setResultado(boolean resultado) {
		this.resultado = resultado;
	}
	public void setI(int i) {
		this.i = i;
	}
	public int getI() {
		return i;
	}
	public void exibirInfo() {
		System.out.println("Digite o valor do orcamento:" + getValor());
	}
	public void resultado() {
		if(i>=1) {
			System.out.println("o orcamento foi aprovado!");
		}else {
			System.out.println("o orcamento foi negado!");
		}
	}
	
	
	
	

}
