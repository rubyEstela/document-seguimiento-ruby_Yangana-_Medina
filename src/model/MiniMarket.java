package model;

import java.util.ArrayList;
import java.util.List;

public class MiniMarket {
	
	private List<Client> clients;

	public MiniMarket() {
		
		clients = new ArrayList<>();
	}
	
	
	public List<Client> getClients(){
		return clients;
	}
	
	
	public void addClient(int typeDocument, int documentNumber){
		Client cli=new Client(typeDocument,documentNumber);
		clients.add(cli);
	}
	
	
	

}
