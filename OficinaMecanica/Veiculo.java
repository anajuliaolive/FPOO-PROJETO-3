package OficinaMecanica;

public class Veiculo {
	private String marca;
	private String cor; 
	private String modelo; 
	private String placa;
	
	//construtor padrao
	public Veiculo () {
		
	}
    //construtor com parametros
	public Veiculo(String marca, String cor, String modelo, String placa) {
		this.marca = marca;
		this.cor = cor;
		this.modelo = modelo;
		this.placa = placa;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getMarca() {
		return marca;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getCor() {
		return cor;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getModelo() {
		return modelo;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getPlaca() {
		return placa;
	}
	public void exibirInfo() {
		System.out.println("Marca:" + getMarca() + "\nCor:" + getCor() + "\nModelo:" + 
				getModelo() + "\nPlaca:" + getPlaca());
	}
	
	
	

}
