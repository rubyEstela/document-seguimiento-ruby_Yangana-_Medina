package exception;

public class PenultimateNumberEXception extends Exception {
	private String documentNumber;

	public PenultimateNumberEXception(String documentNumber) {
		super("el numero no coincide con el dia ni con  el penultimo numero de la cedula"+documentNumber);
		this.documentNumber = documentNumber;
	}

	public String getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}

}
