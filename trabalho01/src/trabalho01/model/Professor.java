package trabalho01.model;

import java.time.LocalDate;

public class Professor implements Impressao {
	private Telefone telfone;
	private String nome;
	private String cpf;
	private String id;
	private LocalDate aniversario;

	public Professor(Telefone telfone, String nome, String cpf, String id, LocalDate aniversario) {
		super();
		this.telfone = telfone;
		this.nome = nome;
		this.cpf = cpf;
		this.id = id;
		this.aniversario = aniversario;
	}

	public Telefone getTelfone() {
		return telfone;
	}

	public void setTelfone(Telefone telfone) {
		this.telfone = telfone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public LocalDate getAniversario() {
		return aniversario;
	}

	public void setAniversario(LocalDate aniversario) {
		this.aniversario = aniversario;
	}

	@Override
	public void imprimir() {
		// TODO Auto-generated method stub

	}
}
