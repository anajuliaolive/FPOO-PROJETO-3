package OficinaMecanica;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

import Aula_0409.Livro;

public class TesteOficinaMecanica {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		Empresa e1 = new Empresa();
		
		System.out.println("===== Empresa 1 =====");
		System.out.println("digite o nome da empresa:");
		e1.setNome(entrada.next());
		System.out.println("Digie o endereco da empresa");
		System.out.println("rua:");
		e1.setRua(entrada.next());
		System.out.println("bairro:");
		e1.setBairro(entrada.next());
		
		
		Cliente c1 = new Cliente();
		System.out.println("====== Cliente 1 ======");
		System.out.println("digite o nome do cliente:");
		c1.setNome(entrada.next());
		System.out.println("digite o telefone do cliente:");
		c1.setTelefone(entrada.next());
		System.out.println("digite o endereco do cliente");
		c1.setEndereco(entrada.next());
		System.out.println("digite sua data de nascimento:(dd-MM-yyyy):");
		String dataNascimento1 = entrada.next();
		LocalDate IIOMetadataNode1 = LocalDate.parse (dataNascimento1, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		c1.setDataNascimento(IIOMetadataNode1);

		Cliente c2 = new Cliente();
		System.out.println("====== Cliente 2 ======");
		System.out.println("digite o nome do cliente:");
		c2.setNome(entrada.next());
		System.out.println("digite o telefone do cliente:");
		c2.setTelefone(entrada.next());
		System.out.println("digite o endereco do cliente");
		c2.setEndereco(entrada.next());
		System.out.println("digite sua data de nascimento:(dd-MM-yyyy):");
		String dataNascimento2 = entrada.next();
		LocalDate IIOMetadataNode2 = LocalDate.parse (dataNascimento2, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		c2.setDataNascimento(IIOMetadataNode2);
		
		Cliente c3 = new Cliente();
		System.out.println("====== Cliente 3 ======");
		System.out.println("digite o nome do cliente:");
		c3.setNome(entrada.next());
		System.out.println("digite o telefone do cliente:");
		c3.setTelefone(entrada.next());
		System.out.println("digite o endereco do cliente");
		c3.setEndereco(entrada.next());
		System.out.println("digite sua data de nascimento:(dd-MM-yyyy):");
		String dataNascimento3 = entrada.next();
		LocalDate IIOMetadataNode3 = LocalDate.parse (dataNascimento2, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		c3.setDataNascimento(IIOMetadataNode3);
		
		Veiculo v1 = new Veiculo();
		System.out.println("===== Veiculo 1 =====");
		System.out.println("digite a marca:");
		v1.setMarca(entrada.next());
		System.out.println("digite a cor:");
		v1.setCor(entrada.next());
		System.out.println("digite o modelo do veiculo:");
		v1.setModelo(entrada.next());
		System.out.println("digite a placa:");
		v1.setPlaca(entrada.next());
		
		Veiculo v2 = new Veiculo();
		System.out.println("===== Veiculo 2 =====");
		System.out.println("digite a marca:");
		v2.setMarca(entrada.next());
		System.out.println("digite a cor:");
		v2.setCor(entrada.next());
		System.out.println("digite o modelo do veiculo:");
		v2.setModelo(entrada.next());
		System.out.println("digite a placa:");
		v2.setPlaca(entrada.next());
		
		
		Orcamento o1 =  new Orcamento();
		System.out.println("===== Ocamento =====");
		System.out.println("digite o valor do orcamento para o conserto do carro:");
		o1.setValor(entrada.nextInt());
		o1.exibirInfo();
		System.out.println("digite 1 para aprovar e 0 para negar:");
		o1.setI(entrada.nextInt());
		o1.resultado();
		
        Funcionario f1 = new Funcionario();
		System.out.println("===== Funcionario 1 =====");
		System.out.println("Digite o nome do funcionario:");
		f1.setNome(entrada.next());
		
		Funcionario f2 = new Funcionario();
		System.out.println("===== Funcionario 2 =====");
		System.out.println("Digite o nome do funcionario:");
		f2.setNome(entrada.next());
		
		
		System.out.println("===== Empresa =====");
		e1.exibirInfo();
		System.out.println("===== Clientes =====");
		c1.exibirInfo();
		System.out.println("===== Veiculos =====");
		v1.exibirInfo();
		System.out.println("===== Orcamento =====");
		o1.resultado();
		System.out.println("===== Funcionarios =====");
		f1.exibirInfo();
		
		
		List<Funcionario> qtd_funcionarios = new ArrayList<Funcionario>();
		//adicionando obj funcionario no obj qtd_Funcionarios
		qtd_funcionarios.add(f1);
		qtd_funcionarios.add(f2);
		//quer ler os livros que estao na lista
		for (Funcionario ver_funcionarios : qtd_funcionarios) {
			System.out.println("funcionarios:" + ver_funcionarios.getNome());
		}
		
		List<Veiculo> qtd_veiculos = new ArrayList<Veiculo>();
		//adicionando obj funcionario no obj qtd_Funcionarios
		qtd_veiculos.add(v1);
		qtd_veiculos.add(v2);
		//quer ler os livros que estao na lista
		for (Veiculo ver_veiculos : qtd_veiculos) {
			System.out.println("veiculos:" + ver_veiculos.getModelo());
		}
		
		List<Cliente> nome_clientes = new ArrayList<Cliente>();
		//adicionando obj funcionario no obj qtd_Funcionarios
		nome_clientes.add(c1);
		nome_clientes.add(c2);
		nome_clientes.add(c3);
		//quer ler os livros que estao na lista
		for (Cliente ver_clientes : nome_clientes) {
			System.out.println("cliente:" + ver_clientes.getNome());
		}
		/*Empresa e1 = new Empresa();
		Cliente c2 = new Cliente();
		c2.setNome(JOptionPane.showInputDialog("Digite o seu nome:"));
		e1.setNome(JOptionPane.showInputDialog("Digite o nome da empresa:"));
		e1.setBairro(JOptionPane.showInputDialog("Digite o bairro:"));
		e1.setRua(JOptionPane.showInputDialog("Digite a rua:"));
		e1.exibirInfo();*/
	
	}
		

}
