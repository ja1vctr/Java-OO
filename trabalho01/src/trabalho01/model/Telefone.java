package trabalho01.model;

public class Telefone {
	private String codigoArea;
	private String numero;

	public Telefone() {
		super();
	}

	public Telefone(String codigoArea, String numero) {
		super();
		this.codigoArea = codigoArea;
		this.numero = numero;
	}

	public String getCodigoArea() {
		return codigoArea;
	}

	public void setCodigoArea(String codigoArea) {
		this.codigoArea = codigoArea;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	
}
