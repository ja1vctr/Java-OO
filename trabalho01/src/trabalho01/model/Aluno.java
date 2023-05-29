package trabalho01.model;

import java.time.LocalDate;
import java.util.Scanner;

public class Aluno implements Impressao {
	private Telefone telfone;
	private String nome;
	private String cpf;
	private String matricula;
	private LocalDate aniversario;
	private Disciplina disciplina;

	public Aluno() {
		super();
	}

	public Aluno(Telefone telfone, String nome, String cpf, String matricula, LocalDate aniversario) {
		this.telfone = telfone;
		this.nome = nome;
		this.cpf = cpf;
		this.matricula = matricula;
		this.aniversario = aniversario;
	}

	public Aluno(Disciplina disciplina) {
		this.disciplina = disciplina;
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

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public LocalDate getAniversario() {
		return aniversario;
	}

	public void setAniversario(LocalDate aniversario) {
		this.aniversario = aniversario;
	}

	public Aluno lerAluno() {
		Scanner scan = new Scanner(System.in);
		Aluno a = new Aluno();
		Telefone t = new Telefone();

		System.out.print("Digite o nome: ");
		a.setNome(scan.next());
		System.out.print("Digite o cpf: ");
		a.setCpf(scan.next());
		System.out.print("Digite o numero de matricula: ");
		a.setMatricula(scan.next());
		System.out.print("Digite o codigo de area do seu estado: ");
		t.setCodigoArea(scan.next());
		System.out.print("Digite o numero de telefone: ");
		t.setNumero(scan.next());
		System.out.print("Digite a data de aniversario (): ");

		return a;
	}

	@Override
	public void imprimir() {

	}
}
