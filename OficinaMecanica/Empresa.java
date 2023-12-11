package OficinaMecanica;

import java.util.List;

public class Empresa {
	//atributos
	private String nome;
	private String rua;
	private String bairro;
	List<Funcionario> qtd_funcionarios; 
	List<Veiculo> qtd_veiculos; 
	
	//construtor padrao
	public Empresa() {
		
	}
	//construtor com parametros
	public Empresa(String nome, String rua, String bairro, List<Funcionario> qtd_funcionarios, List<Veiculo> qtd_veiculos) {
		this.nome = nome;
		this.rua = rua;
		this.bairro = bairro;
		this.qtd_funcionarios = qtd_funcionarios;
		this.qtd_veiculos = qtd_veiculos;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public List<Funcionario> getQtd_funcionarios(){
		return qtd_funcionarios;
	}
	public List<Veiculo> getQtd_veiculos(){
		return qtd_veiculos;
	}
	
	public void exibirInfo() {
		System.out.println("\nNome da empresa:" + getNome() + "\nRua:" + getRua() + "\nBairro:" + getBairro());	
	}

}
