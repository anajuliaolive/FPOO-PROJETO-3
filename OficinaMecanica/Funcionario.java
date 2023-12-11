package OficinaMecanica;

import java.util.List;

public class Funcionario {
	private String nome;
	List<Cliente> nome_clientes; 
	
	//construtor padrao
	public Funcionario() {
		
	}
    //construtor com parametros
	public Funcionario(String nome, List<Cliente> nome_clientes) {
		this.nome = nome;
		this.nome_clientes = nome_clientes;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void exibirInfo() {
		System.out.println( getNome() + " esta realizando o orcamento...");
	}
	public List<Cliente> getNome_clientes(){
		return nome_clientes;
	}

}
