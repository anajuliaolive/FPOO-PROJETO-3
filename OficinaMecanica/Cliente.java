package OficinaMecanica;

import java.time.LocalDate;

public class Cliente {
	private String nome;
	private String telefone; 
	private String endereco; 
	private LocalDate dataNascimento;
    
	//costrutor padaro
    public Cliente() {
	
  }
    //construtor com parametros 
	public Cliente(String nome, String telefone, String endereco, LocalDate dataNascimento) {
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
		this.dataNascimento = dataNascimento;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	
	}
	public String getTelefone() {
		return telefone;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void exibirInfo() {
		System.out.println("Nome do cliente:" + getNome() + "\nTelefone do cliente:" + getTelefone() + "\nEndereco do cliente:" + 
				getEndereco() + "\nData de nascimento:" + getDataNascimento());
	}
}
                