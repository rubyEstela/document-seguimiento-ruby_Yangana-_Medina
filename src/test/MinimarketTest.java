package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exception.AdultException;
import exception.PenultimateNumberEXception;
import model.Client;

class MinimarketTest {
	private  Client cls;
	private  void setUpScenari2() {
		cls=new Client(1, "1151");
	}
	
	
	@Test
	public void addClient() throws AdultException  {
		setUpScenari2();	
		String currVal = cls.getDocumentNumber();
		String newVal =" 1234";
		cls.getDocumentNumber();			
		fail("");
	}
	

}
