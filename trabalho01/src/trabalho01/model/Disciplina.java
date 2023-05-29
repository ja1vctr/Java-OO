package trabalho01.model;

import trabalho01.enums.StatusDisciplina;

public class Disciplina implements Impressao {
	public Double nota1;
	public Double nota2;
	public Double media;
	public StatusDisciplina status;

	public Disciplina(Double nota1, Double nota2, Double media, StatusDisciplina status) {
		super();
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.media = media;
		this.status = status;
	}

	public Double getNota1() {
		return nota1;
	}

	public void setNota1(Double nota1) {
		this.nota1 = nota1;
	}

	public Double getNota2() {
		return nota2;
	}

	public void setNota2(Double nota2) {
		this.nota2 = nota2;
	}

	public Double getMedia() {
		return media;
	}

	public void setMedia(Double media) {
		this.media = media;
	}

	public StatusDisciplina getStatus() {
		return status;
	}

	public void setStatus(StatusDisciplina status) {
		this.status = status;
	}

	@Override
	public void imprimir() {
		// TODO Auto-generated method stub

	}

}
