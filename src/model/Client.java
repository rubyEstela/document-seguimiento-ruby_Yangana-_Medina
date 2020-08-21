package model;

public class Client {

	public static int TI = 1;
	public static int CC = 2;
	public static int PP = 3;
	public static int CE = 4;

	private int typeDocument;
	private int documentNumber;

	public Client(int typeDocument, int documentNumber) {

		this.typeDocument = typeDocument;
		this.documentNumber = documentNumber;
	}

	public int getTypeDocument() {
		return typeDocument;
	}

	public void setTypeDocument(int typeDocument) {
		this.typeDocument = typeDocument;
	}

	public int getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(int documentNumber) {
		this.documentNumber = documentNumber;
	}

	public static int getTI() {
		return TI;
	}

	public static void setTI(int tI) {
		TI = tI;
	}

	public static int getCC() {
		return CC;
	}

	public static void setCC(int cC) {
		CC = cC;
	}

	public static int getPP() {
		return PP;
	}

	public static void setPP(int pP) {
		PP = pP;
	}

	public static int getCE() {
		return CE;
	}

	public static void setCE(int cE) {
		CE = cE;
	}
	
	
	public int typeDocuments() {
		int type = 0;
		if (typeDocument == TI) {
			type = 1;
		}
		if (typeDocument == CC) {
			type = 2;

		}
		if (typeDocument == PP) {
			type = 3;

		} else {
			type = 4;
		}

		return type;
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
