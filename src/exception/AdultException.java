package exception;

public class AdultException extends Exception {
	private int typeDocument;
	
	

	public AdultException(int typeDocument) {
		super("tienes documento TI , debes ser mayor de edad"+typeDocument);
		this.typeDocument = typeDocument;
	}

	public int getTypeDocument() {
		return typeDocument;
	}

	public void setTypeDocument(int typeDocument) {
		this.typeDocument = typeDocument;
	}
	

}
