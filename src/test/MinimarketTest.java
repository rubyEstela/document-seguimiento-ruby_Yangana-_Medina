package test;

import static org.junit.Assert.assertTrue;
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
	public void addClient()  {
		setUpScenari2();
		
		int typeDocument =1;
		 int documentNumbert = 1151;
		 
		 int esperado = typeDocument+documentNumbert;
		 
		 assertTrue(esperado,cls.getDocumentNumber()+cls.getTypeDocument());
		
		
		

}


	private void assertTrue(int esperado, String string) {
		// TODO Auto-generated method stub
		
	}
}